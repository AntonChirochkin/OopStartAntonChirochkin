package OopStart;

public class Main {
    public static void main (String[] args) {
        Automobile automobile1 = new Automobile("Lada", "Granta", 1.7, "yellow", 2015, "Russian Federation");
        Automobile automobile2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Automobile automobile3 = new Automobile("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Automobile automobile4 = new Automobile("Kia", "Sportage 4th generation", 2.4, "red", 2018, "South Korea");
        Automobile automobile5 = new Automobile("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(automobile1);
        System.out.println(automobile2);
        System.out.println(automobile3);
        System.out.println(automobile4);
        System.out.println(automobile5);
    }
}
