package by.belstu.Chayeuski.Task1_1;

import java.util.Random;

public class Car extends Thread {
    public String carsName;
    public Street street;
    Random random = new Random();

    public Car(int pCarName, Street pStreet)
    {
        this.carsName = String.valueOf(pCarName);
        this.street = pStreet;
        System.out.println("Car " + this.carsName + " came");
    }

    @Override
    public void run()
    {
        synchronized (street) {
            street.showStreet();
                boolean flag = random.nextBoolean();
                if (flag) {
                    street.addCarToFirstDirection(this);
                }
                else {
                    street.addCarToSecondDirection(this);
                }
                System.out.println("Car " + this.getCarsName() + " is on " + (flag?1:2) + " directory");
                try
                {
                    street.wait(1000);
                    synchronized (street) {
                        street.crossTheRoad(flag);
                    }
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    public String getCarsName(){
        return this.carsName;
    }
}
