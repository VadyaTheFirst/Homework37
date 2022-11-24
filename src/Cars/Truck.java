package Cars;

public final class Truck extends Car implements Challenging , TakeTechInspection{
    private float loadCapacity;

    public Truck(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, float loadCapacity) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
        if (loadCapacity<1){
            loadCapacity=1;
        } else {
            this.loadCapacity=loadCapacity;
        }
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void maxChallangeSpeed() {

    }



    @Override
    public void bestCircleTime() {




    }

    @Override
    public void takeTechInspection() {
        System.out.println("Проходит ТО");
    }
}
