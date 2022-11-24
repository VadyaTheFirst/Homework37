package Drivers;
import Cars.Car;


    public class CarLicense < T extends Car >  {
        private final CarDriver driver;
        private final String licenceType;

        public CarLicense(CarDriver driver, String licenceType) {
            this.driver = driver;
            this.licenceType = licenceType;
        }

        public void drives(T car){
            if (!driver.getHasDriverLicense()){
                System.out.println("У этого водителя нет прав");
            } else {
                System.out.println(driver.getFIO() + " с лицензией "+licenceType + " водит "+car.getBrand());
            }
        }
    }

