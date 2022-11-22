import Cars.*;

import Drivers.CarDriver;
import Drivers.CarLicenseA;
import Drivers.CarLicenseB;
import Drivers.CarLicenseC;
import Mechanic.Mechanics;
import Mechanic.Pitstation;

import java.util.ArrayList;



public class Main {
    private static ArrayList<Car> cars;
    private static ArrayList<Sponsor> sponsors;
    private static ArrayList<Mechanics> mechanics;
    public static void main(String[] args) {




        LightWeight car0 = new LightWeight("Lada", "Granta",
                2022, "Россия", "Черная", 100, 1.2f);
        Bus car1 = new Bus("УАЗ", "Буханка",
                2019, "Россия", "Зеленый", 80, 3.2f, 12);
        Truck car2 = new Truck("МАЗ", "Камаз",
                1998, "Россия", "Синий", 80, 4.2f, 12.5f);
        LightWeight car3= new LightWeight("Labborghini", "Galado",
                2022, "Italy", "Yellow", 340, 12.5f);
        Bus car4 = new Bus("Mercedes-Benz", "Крутой",
                2019, "Германия", "Желтый", 130, 3.2f, 30);
        Truck car5 = new Truck("MAC", "Гтлтщцт",
                2021, "Sweden", "Синий", 130, 4.2f, 8.5f);




        LightWeight carA = new LightWeight("Lada", "Granta",
                2022, "Россия", "Черная", 100, 1.2f);
        Truck carB = new Truck("МАЗ", "Камаз",
                1998, "Россия", "Синий", 80, 4.2f, 12.5f);
        Bus carC = new Bus("Mercedes-Benz", "?",
                2019, "Германия", "Желтый", 130, 3.2f, 30);

        CarDriver driverA = new CarDriver("Шумахер", true, 5);
        CarLicenseA licenseA = new CarLicenseA(driverA);
        licenseA.drives(carA);

        CarDriver driverB = new CarDriver("Федя Волков", true, 4);
        CarLicenseB licenseB = new CarLicenseB(driverB);
        licenseB.drives(carB);


        CarDriver driverC = new CarDriver("Коля Бухой", false, 4);
        CarLicenseC licenseC = new CarLicenseC(driverC);
        licenseC.drives(carC);

        cars = new ArrayList<>(7);
        cars.add(car0);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);





        Sponsor sponsor1 = new Sponsor(true,5000,"Яйца в смятку");
        sponsor1.supportCar(cars.get(0), cars.get(3));
        Sponsor sponsor2 = new Sponsor(true,51000,"Алкашня Инкорпорейтд");
        sponsor2.supportCar(cars.get(1),cars.get(4));

        sponsors = new ArrayList<>(5);
        sponsors.add(sponsor1);
       sponsors.add(sponsor2);

        Mechanics mechanic1= new Mechanics("Вася","ХЗ");
        Mechanics mechanic2= new Mechanics("Петя","Рога и Копыта");
        mechanic1.repair(cars.get(0),cars.get(2));
        mechanic2.repair(cars.get(1),cars.get(4));

        mechanics = new ArrayList<>(7);
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);


        Pitstation<TakeTechInspection> pit1= new Pitstation<>();
        pit1.addCar(car0);
        pit1.addCar(car5);
        pit1.addCar(car2);
        pit1.technicalInspetion();






    }


}