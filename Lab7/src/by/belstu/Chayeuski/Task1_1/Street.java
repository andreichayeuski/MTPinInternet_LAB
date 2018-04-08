package by.belstu.Chayeuski.Task1_1;

import java.util.ArrayDeque;

public class Street {
    private ArrayDeque<Car> firstDirection;
    private ArrayDeque<Car> secondDirection;
    public int streetSize;
    static int countOfCars = 1;
    static boolean selectDirection = true;

    public Street(int size, int count)
    {
        this.streetSize = size;
        firstDirection = new ArrayDeque<Car>(count);
        secondDirection = new ArrayDeque<Car>(count);
    }

    public synchronized void crossTheRoad(boolean flag)
    {
        String line = new String();
        boolean canDriveAway = false;
        while (!canDriveAway)
        {
            if (this.countOfCars > this.streetSize || this.checkDirection(flag))
            {
                selectDirection = !selectDirection;
                this.countOfCars = 1;
            }

        Car car = null;
        if (flag == selectDirection)
        {
            this.countOfCars++;
            car = getCar(selectDirection);
        }

        if (car == null)
        {
            line = "Don't have auto";
        }
        else
        {
            line = car.getCarsName() + " is left";
            canDriveAway = true;
        }
        }
        System.out.println(line);
    }

    public synchronized Car getCar(boolean flag)
    {
        if(flag)
        {
            return getCarFromFirstDirection();
        }
        else
        {
            return getCarFromSecondDirection();
        }
    }

    public synchronized boolean checkDirection(boolean flag)
    {
        if(flag)
        {
            return checkCarInFirstDirection();
        }
        else
        {
            return checkCarInSecondDirection();
        }
    }

    public synchronized void addCarToFirstDirection(Car car)
    {
        this.firstDirection.addLast(car);
    }

    public synchronized void addCarToSecondDirection(Car car)
    {
        this.secondDirection.addLast(car);
    }

    public synchronized Car getCarFromFirstDirection()
    {
        if (this.checkCarInFirstDirection())
        {
            return this.firstDirection.pollFirst();
        }
        else
        {
            return null;
        }
    }

    public synchronized Car getCarFromSecondDirection()
    {

        if (this.checkCarInSecondDirection())
        {
            return this.secondDirection.pollFirst();
        }
        else
        {
            return null;
        }
    }

    public synchronized boolean checkCarInFirstDirection()
    {
        return !this.firstDirection.isEmpty();
    }

    public synchronized boolean checkCarInSecondDirection()
    {
        return !this.secondDirection.isEmpty();
    }

    public synchronized void showStreet()
    {
        System.out.print("Street places:\nFirst Direction { ");
        for (Car c: this.firstDirection) {
            System.out.print(c.getCarsName()+" ");
        }
        System.out.print("};\nSecond Direction { ");
        for (Car c: this.secondDirection) {
            System.out.print(c.getCarsName()+" ");
        }
        System.out.println("}");
    }
}
