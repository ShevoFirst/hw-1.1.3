import transport.Bus;
import transport.PassangerCar;
import transport.Truck;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {
        PassangerCar granta = new PassangerCar("Lada","Granta",1.7);
        PassangerCar audiA8 = new PassangerCar("Audi","A8 50 L TDI quattro",3.0 );
        PassangerCar bmwZ8 = new PassangerCar("BMW","Z8",3.0);
        PassangerCar sportage = new PassangerCar("KIA","Sportage",2.4);

        Bus ikarus = new Bus("Икарус","435",3.0);
        Bus toyota = new Bus("Toyota","Coaster",3.5);
        Bus ford = new Bus("Ford","Torneo",3.2);
        Bus ford2 = new Bus("Ford","567",3.2);

        Truck fo32 = new Truck("Ford","32",3.5);
        Truck me43 = new Truck("Mercedess","43",3.7);
        Truck to54 = new Truck("Toyota","54",4);
        Truck la32 = new Truck("Lada","32",3.0);
    }
}