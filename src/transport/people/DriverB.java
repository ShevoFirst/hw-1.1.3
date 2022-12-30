package transport.people;

import transport.PassangerCar;

public class DriverB extends Driver<PassangerCar>{

    public DriverB(String fio, boolean haveLicense, int exp, PassangerCar category) {
        super(fio, haveLicense, exp, category);
    }
}
