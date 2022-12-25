package transport;

public class Transport {
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

        System.out.println(toString());

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

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue;
    }
}
