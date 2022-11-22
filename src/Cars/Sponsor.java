package Cars;

import java.util.ArrayList;

public class Sponsor {
    private boolean isCompany;
    private final int sum;
    private final String name;

    public Sponsor(boolean isCompany, int sum, String name) {
        this.isCompany = isCompany;
        this.sum = sum;
        this.name = name;
    }

    public boolean isCompany() {
        return isCompany;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public void supportCar(Car...cars){
        for (Car car : cars) {
            System.out.println(getName() + " спонсирует автомобиль " + car.getBrand()+" на "+getSum()+" USD");
        }

    }
}
