package transport;


public class PassangerCar extends Transport implements Competition{
    private final TypeByBody typeByBody;
    PassangerCar passangerCar;

    public enum TypeByBody{
        SEDAN("Седан"),
        HACHBACK("Хэчбек"),
        KUPE("Купе"),
        UNIVERSAL("Универсал"),
        OUTRROAD("Внедорожник"),
        KROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        FURGON("Фургон"),
        MINIWAN("Минивэн");

        private String body;

        TypeByBody(String body) {
            this.body = body;
        }

        public String getBody() {
            return body;
        }
    }
    public PassangerCar(String brand, String model, double engineValue , TypeByBody typeByBody) {
        super(brand, model, engineValue);
        this.typeByBody = typeByBody;
        System.out.println(toString());
    }

    public TypeByBody getTypeByBody() {
        return typeByBody;
    }

    @Override
    void printType() {
        if (typeByBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(typeByBody.name());
    }

    public String toString() {
        return
                "brand='" + getBrand() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", engineValue=" + getEngineValue() +
                " Тип кузова: "+ typeByBody.getBody();
    }
}
