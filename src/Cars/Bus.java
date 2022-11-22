package Cars;

public final class Bus extends Car implements Challenging{
    private int seatsNumber;

    @Override
    public void pitStop() {

    }

    @Override
    public void maxChallangeSpeed() {

    }

    @Override
    public void bestCircleTime() {

    }

    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, int seatsNumber) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);

        if (seatsNumber<8){
            this.seatsNumber=8;
        } else {
            this.seatsNumber=seatsNumber;
        }



    }


    }

