package transport;


import transport.people.AutoMechanic;

import java.util.List;

public class Truck extends Transport implements Competition{
    private LoadCapacity loadCapacity;
    Truck truck;

    @Override
    public boolean diagnosed() throws Exception {
        return Math.random() > 0.5;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(loadCapacity.toString());
    }

    public enum LoadCapacity{
        N1(0f,3.5f),
        N2(3.5f,12.0f),
        N3(12f,0f);
        private float upper;
        private float downer;

        public float getUpper() {
            return upper;
        }

        public float getDowner() {
            return downer;
        }

        LoadCapacity(Float downer, Float upper) {
            this.upper = upper;
            this.downer = downer;
        }

        @Override
        public String toString() {
            if (upper == 0) {
                return "Грузоподъемность: свыше " + downer +" тонн";
            }else if (downer==0)
                return "Грузоподъемность: до " + upper +" тонн";
            return "Грузоподъемность: от "+downer+" до " + upper +" тонн";
        }
    }
    public Truck(String brand, String model, double engineValue, LoadCapacity loadCapacity, List<AutoMechanic> autoMechanic) {
        super(brand, model, engineValue , autoMechanic);
        this.loadCapacity = loadCapacity;
        System.out.println(this);
    }

    public String toString() {
        return
                "brand='" + getBrand() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", '" + loadCapacity.toString() + '\'' +
                        ", engineValue=" + getEngineValue();
    }

}
