package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineValue;

    public Transport(String brand, String model, double engineValue) {
        if (engineValue <= 0) {
            this.engineValue = 1.5;
        }else this.engineValue = engineValue;

        if (brand == null || brand.isEmpty()) {
            this.brand = "defoult";
        }else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = "defoult";
        }else this.model = model;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    void startMotion(){
        System.out.println(getModel() + " начинает движение");
    }

    void stopMotion(){
        System.out.println(getModel() + " закончил движение");
    }

    public void pitStop() {
        System.out.println(getModel() + " остановился на pitstop");

    }
    public void mustTime() {
        System.out.println(getModel() + " имеет лучшее время");

    }

    public void maxSpeed() {
        System.out.println(getModel() + " имеет лучшую скорость");

    }

    abstract void printType();
    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue;
    }
}
