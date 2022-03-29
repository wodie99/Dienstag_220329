package model;

public class Friend extends Contact {

    protected String phoneNumber;

    public Friend() {
        super();
    }

    public Friend(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
