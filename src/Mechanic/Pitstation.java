package Mechanic;

import Cars.Car;
import Cars.LightWeight;
import Cars.Truck;
import Cars.TakeTechInspection;

import java.util.LinkedList;
import java.util.Queue;

public class Pitstation<T extends TakeTechInspection> {
    private  Queue<T> queue = new LinkedList<>();

    public Pitstation() {

    }

    public void addCar(T car) {
        queue.offer(car);
    }

    public void technicalInspetion() {
        T car = queue.poll();

            if (car != null) {
                System.out.println("Обслуживания ожидают " + queue.size() + " автомобилей");
                System.out.println(car.getClass() + " " + car.toString() + " прошел техосмотр");
                technicalInspetion();
            } else {
                System.out.println("ТО свободно");
            }

        }
    }

