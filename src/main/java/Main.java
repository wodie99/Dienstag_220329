import model.Friend;
import model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Friend eva = new Friend("Eva", "089-123456");
        Friend bernd = new Friend("Bernd", "0761-7654321");
        Friend anna = new Friend ("Anna", "0201-1234321");
        Friend[] friends = new Friend[] {eva, bernd, anna};

        Smartphone smartphone = new Smartphone("S20", "Samsung", friends, false);
        System.out.println(smartphone);
    }
}
