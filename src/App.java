import Animal.Birds.*;
import Animal.Fish.*;
import Animal.Reptile.*;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile crocodile = new Crocodile(2.0, 1000.0, "crocodile", "B");
        Eel eel = new Eel(1.0, 0.1, "Eel", "A");
        Eagle eagle = new Eagle(2.0, 4.5, "Eagle", "T");

        System.out.println("Crocodile's Information");
        System.out.println("---------------------");
        crocodile.showInfo();
        System.out.println("---------------------\n");

        System.out.println("Eel's Information");
        System.out.println("---------------------");
        eel.showInfo();
        System.out.println("---------------------\n");

        System.out.println("Eagle's Information");
        System.out.println("---------------------");
        eagle.showInfo();
        System.out.println("---------------------");
    }
}
