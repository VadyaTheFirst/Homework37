package Cars;


public final class LightWeight extends Car implements Challenging , TakeTechInspection {

    public LightWeight(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void maxChallangeSpeed() {
        System.out.println("Максимальная скорость в гонке для "+getBrand()+" равна "+getMaxSpeed());
    }

    @Override
    public void bestCircleTime() {

    }

    @Override

    public void takeTechInspection() {
        System.out.println("Проходит ТО");
    }

    }

