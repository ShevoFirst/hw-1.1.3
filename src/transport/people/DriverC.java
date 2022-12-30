package transport.people;

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fio, boolean haveLicense, int exp, Truck category) {
        super(fio, haveLicense, exp, category);
    }
}
