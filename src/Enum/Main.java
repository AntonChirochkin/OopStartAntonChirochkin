package Enum;

public class Main {
    public static void main(String[] args) {
         //for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Иван cat. B ", true, 5);

            Car car = new Car("Audi", "SQ8", 435, driverB, Bodytape.COUPE);
            Car car2 = new Car("BMV", "X7", 530, driverB,Bodytape.UNIVERSAL);
            Car car3 = new Car("Mersedes", "GLS", 612, driverB, Bodytape.JEEP);


            DriverD driverD = new DriverD("Кирилл cat. D ", true, 10);

            Bus bus = new Bus("Лиаз", "667", 175, driverD, Size.S);
            Bus bus2 = new Bus("ЛАЗ", "695", 150, driverD, Size.XS);
            Bus bus3 = new Bus("Икарус", "250 SL", 258, driverD,Size.XL);


            DriverC driverC = new DriverC("Борис cat. C ", true, 7);

            Lorry lorry = new Lorry("Камаз", "5490", 428, driverC, LoadСapacity.N1);
            Lorry lorry2 = new Lorry("Scania", "R", 730, driverC, LoadСapacity.N2);
            Lorry lorry3 = new Lorry("Iveco", "S-Way", 400, driverC, LoadСapacity.N3);


        car.passDiagnostics();
        bus.passDiagnostics();
        lorry.passDiagnostics();


    }
    public static void checkTransport(Transport... transports) {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()){
                try {
                    throw new RuntimeException((transport.getBrand() + " " + transport.getModel()) + " не прошел диагностику!.");
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            } else {
                count++;
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей.");
    }

}
