import transport.Transport;
import transport.people.DriverB;
import transport.people.DriverC;
import transport.people.DriverD;
import transport.Bus;
import transport.PassangerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) throws Exception {
        PassangerCar granta = new PassangerCar("Lada","Granta",1.7, PassangerCar.TypeByBody.SEDAN );
        PassangerCar audiA8 = new PassangerCar("Audi","A8 50 L TDI quattro",3.0 , PassangerCar.TypeByBody.KROSSOVER);
        PassangerCar bmwZ8 = new PassangerCar("BMW","Z8",3.0, PassangerCar.TypeByBody.PICKUP);
        PassangerCar sportage = new PassangerCar("KIA","Sportage",2.4, PassangerCar.TypeByBody.KUPE);
        System.out.println();

        Bus ikarus = new Bus("Икарус","410",3.0, Bus.Capacity.VERYBIG);
        Bus toyota = new Bus("Toyota","Coaster",3.5, Bus.Capacity.AVARAGE);
        Bus ford = new Bus("Ford","Torneo",3.2, Bus.Capacity.SMALL);
        Bus ford2 = new Bus("Ford","567",3.2, Bus.Capacity.SMALL);
        System.out.println();

        Truck fo32 = new Truck("Ford","32",3.5, Truck.LoadCapacity.N1);
        Truck me43 = new Truck("Mercedess","43",3.7, Truck.LoadCapacity.N2);
        Truck to54 = new Truck("Toyota","54",4, Truck.LoadCapacity.N3);
        Truck la32 = new Truck("Lada","32",3.0, Truck.LoadCapacity.N1);
        System.out.println();

        DriverC dima = new DriverC("Шевченко Дмитрий Леонидович", true, 4, fo32);
        DriverB vova = new DriverB("Булкин Владимир Сергеевич", true, 7, bmwZ8);
        DriverD roma = new DriverD("Булкин Роман Сергеевич", true, 3, ford);
        dima.regToCompetition();
        System.out.println();

        service(ford2,fo32,granta);



    }
        private static void service(Transport... transports) throws Exception {
            for (Transport transport : transports) {
                try {
                    if (!transport.diagnosed()) {
                        throw new RuntimeException("Автомобиль " + transport.getName() + " не прошел проверку");
                    }
                    System.out.println("Автомобиль " + transport.getName() + " прошел проверку");
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        }
}