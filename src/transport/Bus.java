package transport;

import transport.people.AutoMechanic;

import java.util.List;

public class Bus  extends Transport  implements Competition{
    private Capacity capacity;
    Bus bus;

    public enum Capacity{
        VERYSMALL(0,10),
        SMALL(0,25),
        AVARAGE(40,50),
        BIG(60,80),
        VERYBIG(100,120);
        private int upper;
        private int downer;

        public float getUpper() {
            return upper;
        }

        public float getDowner() {
            return downer;
        }

        Capacity(int downer, int upper) {
            this.upper = upper;
            this.downer = downer;
        }

        @Override
        public String toString() {
            if (upper == 0) {
                return "Вместимость: свыше " + downer +" человек";
            }else if (downer==0)
                return "Вместимость: до " + upper +" человек";
            return "Вместимость: от "+downer+" до " + upper +" человек";
        }
    }
    public Bus(String brand, String model, double engineValue, Capacity capacity , List<AutoMechanic> autoMechanic) {
        super(brand, model, engineValue , autoMechanic);
        this.capacity = capacity;
        System.out.println(this);
    }

    @Override
    public boolean diagnosed() throws Exception {
        System.out.println("Автобус " + getModel()+ " в диагностике не нуждается");
        return true;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(capacity.toString());
    }

    public String toString() {
        return
                "brand='" + getBrand() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", '" + capacity.toString() + '\'' +
                        ", engineValue=" + getEngineValue();
    }

}
