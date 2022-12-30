package transport.people;

import transport.Transport;

public abstract class Driver<C extends Transport> {
    public final String fio;
    private boolean haveLicense;
    private int exp;
    private C category;
    public void regToCompetition(){
        System.out.println("Водитель "+getFio()+" управляет автомобилем "+ category.getBrand()+" "+ category.getModel()+" и будет участвовать в заезде");
        category.printType();
    }
    public Driver(String fio, boolean haveLicense, int exp, C category) {
        this.fio = fio;
        this.haveLicense = haveLicense;
        this.exp = exp;
        setCategory(category);
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

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("необходимо указать автомобиль");
        }
        this.category = category;
    }

    public C getCategory() {
        return category;
    }
}
