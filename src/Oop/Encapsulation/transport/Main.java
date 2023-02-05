package Oop.Encapsulation.transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",
                "X7",
                -1.0,
                " ",
                2040,
                " ",
                " ",
                " ",
                "A745PO196",
                0, true);


        System.out.println(car);

        car.winterSummer(LocalDate.now().getMonthValue());

        Car.Key key = new Car.Key(true, false);
    }
}
