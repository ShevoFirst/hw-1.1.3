import transport.Transport;
import transport.people.*;
import transport.Bus;
import transport.PassangerCar;
import transport.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<AutoMechanic> autoMechanics = new ArrayList<>();
        autoMechanics.add(new AutoMechanic<Bus>("Володя","Редбулл"));
        autoMechanics.add(new AutoMechanic<Truck>("Санек","ВТБ"));
        autoMechanics.add(new AutoMechanic<PassangerCar>("Лёха","XBET"));

        PassangerCar granta = new PassangerCar("Lada","Granta",1.7, PassangerCar.TypeByBody.SEDAN , autoMechanics);
        PassangerCar audiA8 = new PassangerCar("Audi","A8 50 L TDI quattro",3.0 , PassangerCar.TypeByBody.KROSSOVER, autoMechanics);
        PassangerCar bmwZ8 = new PassangerCar("BMW","Z8",3.0, PassangerCar.TypeByBody.PICKUP, autoMechanics);
        PassangerCar sportage = new PassangerCar("KIA","Sportage",2.4, PassangerCar.TypeByBody.KUPE, autoMechanics);
        System.out.println();

        Bus ikarus = new Bus("Икарус","410",3.0, Bus.Capacity.VERYBIG, autoMechanics);
        Bus toyota = new Bus("Toyota","Coaster",3.5, Bus.Capacity.AVARAGE, autoMechanics);
        Bus ford = new Bus("Ford","Torneo",3.2, Bus.Capacity.SMALL, autoMechanics);
        Bus ford2 = new Bus("Ford","567",3.2, Bus.Capacity.SMALL, autoMechanics);
        System.out.println();

        Truck fo32 = new Truck("Ford","32",3.5, Truck.LoadCapacity.N1, autoMechanics);
        Truck me43 = new Truck("Mercedess","43",3.7, Truck.LoadCapacity.N2, autoMechanics);
        Truck to54 = new Truck("Toyota","54",4, Truck.LoadCapacity.N3, autoMechanics);
        Truck la32 = new Truck("Lada","32",3.0, Truck.LoadCapacity.N1, autoMechanics);
        System.out.println();

        DriverC dima = new DriverC("Шевченко Дмитрий Леонидович", true, 4, fo32);
        DriverB vova = new DriverB("Булкин Владимир Сергеевич", true, 7, bmwZ8);
        DriverD roma = new DriverD("Булкин Роман Сергеевич", true, 3, ford);
        dima.regToCompetition();
        System.out.println();

        service(ford2,fo32,granta);

        List<Transport> cars = new ArrayList<>();
        cars.add(fo32);
        cars.add(bmwZ8);
        cars.add(ford);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(dima);
        drivers.add(vova);
        drivers.add(roma);
        fo32.getAutoMechanics().get(2).fixCar();

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