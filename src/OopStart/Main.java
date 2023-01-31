package OopStart;

public class Main {
    public static void main (String[] args) {
        Automobile automobile1 = new Automobile();
        automobile1.brand = "lada";
        automobile1.model = "Granta";
        automobile1.engineVolume = 1.7;
        automobile1.color = "yellow";
        automobile1.productionYear = 2015;
        automobile1.productionCountry = "Russian Federation";

        System.out.println(automobile1);

        Automobile automobile2 = new Automobile();
        automobile2.brand = "Audi";
        automobile2.model = "A8 50 L TDI quattro";
        automobile2.engineVolume = 3.0;
        automobile2.color = "black";
        automobile2.productionYear = 2020;
        automobile2.productionCountry = "Germany";

        System.out.println(automobile2);

        Automobile automobile3 = new Automobile();
        automobile3.brand = "BMW";
        automobile3.model = "Z8";
        automobile3.engineVolume = 3.0;
        automobile3.color = "black";
        automobile3.productionYear = 2021;
        automobile3.productionCountry = "Germany";

        System.out.println(automobile3);

        Automobile automobile4 = new Automobile();
        automobile4.brand = "Kia";
        automobile4.model = "Sportage 4th generation";
        automobile4.engineVolume = 2.4;
        automobile4.color = "red";
        automobile4.productionYear = 2018;
        automobile4.productionCountry = "South Korea";

        System.out.println(automobile4);

        Automobile automobile5 = new Automobile();
        automobile5.brand = "Hyundai";
        automobile5.model = "Avante";
        automobile5.engineVolume = 1.6;
        automobile5.color = "Orange";
        automobile5.productionYear = 2016;
        automobile5.productionCountry = "South Korea";

        System.out.println(automobile5);
    }
}
