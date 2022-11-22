package Mechanic;
import Cars.Car;

import java.util.ArrayList;

public class Mechanics {

    private final String mechanicName;
    private final String companyName;


    public Mechanics(String mechanicName, String companyName) {
        this.mechanicName = mechanicName;
        this.companyName = companyName;
    }


    public String getName() {
        return mechanicName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "mechanicName='" + mechanicName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void repair(Car... cars){
        for (Car car : cars) {
            System.out.println(getName()+" чинит "+car.getClass()+" "+car.getBrand()+" "+car.getModel());

       }
    }


}
