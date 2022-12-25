package people;

import transport.Bus;
import transport.Truck;

public class DriverD extends Driver<Bus>{
    public DriverD(String fio, boolean haveLicense, int exp) {
        super(fio, haveLicense, exp);
    }
}
