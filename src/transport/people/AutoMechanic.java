package transport.people;

import transport.Transport;

public class AutoMechanic <C extends Transport>{
    private String fullName;
    private String company;

    public AutoMechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }
    public void maintenance(){
        System.out.println(fullName+" проводит тех обслуживание автомобиля");
    }

    public void fixCar(){
        System.out.println(fullName+" чинит машину");
    }
    @Override
    public String toString() {
        return "AutoMechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company;
    }
}
