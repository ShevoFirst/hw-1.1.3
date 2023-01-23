package transport.people;

import transport.Transport;

import java.util.Objects;

public class AutoMechanic{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoMechanic that = (AutoMechanic) o;
        return fullName.equals(that.fullName) && company.equals(that.company);
    }//

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    } //
}
