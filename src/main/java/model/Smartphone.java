package model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    protected String SmartphoneModel;
    protected String SmartphoneBrand;
    protected Friend[] friends;
    protected boolean radioOn;
    protected String position = "München"; // Normallerweise von der Hardware geliefert

    public Smartphone() {
    }

    public Smartphone(String smartphoneModel, String smartphoneBrand, Friend[] friends, boolean radioOn) {
        SmartphoneModel = smartphoneModel;
        SmartphoneBrand = smartphoneBrand;
        this.friends = friends;
        this.radioOn = radioOn;

    }

    public String getSmartphoneModel() {
        return SmartphoneModel;
    }

    public void setSmartphoneModel(String smartphoneModel) {
        SmartphoneModel = smartphoneModel;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio startet");
        radioOn = true;
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Raadio stopped");
        radioOn = false;
        return false;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "SmartphoneModel='" + SmartphoneModel + '\'' +
                ", SmartphoneBrand='" + SmartphoneBrand + '\'' +
                ", friends=" + Arrays.toString(friends) +
                ", radioOn=" + radioOn +
                ", position='" + position + '\'' +
                '}';
    }
}

