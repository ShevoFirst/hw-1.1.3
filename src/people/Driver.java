package people;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    public final String fio;
    private boolean haveLicense;
    private int exp;
    public void regToCompetition(T transport){
        System.out.println("Водитель "+getFio()+" управляет автомобилем "+ transport.getBrand()+" "+ transport.getModel()+" и будет участвовать в заезде");
    }
    public Driver(String fio, boolean haveLicense, int exp) {
        this.fio = fio;
        this.haveLicense = haveLicense;
        this.exp = exp;
    }
    void startMotion(){
        System.out.println(getFio() + " начинает движение");
    }

    void stopMotion(){
        System.out.println(getFio() + " закончил движение");
    }

    public String getFio() {
        return fio;
    }

    public boolean isHaveLicense() {
        return haveLicense;
    }

    public void setHaveLicense(boolean haveLicense) {
        this.haveLicense = haveLicense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
