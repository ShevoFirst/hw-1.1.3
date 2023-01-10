package transport.people;

import transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String fio, boolean haveLicense, int exp, Bus category) {
        super(fio, haveLicense, exp, category);
    }
}

