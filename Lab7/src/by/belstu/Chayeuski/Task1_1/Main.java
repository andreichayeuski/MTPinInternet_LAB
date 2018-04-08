package by.belstu.Chayeuski.Task1_1;

import java.util.Random;

public class Main {
    public static final int CARCOUNT = 20;
    public static final int STREETSIZE = 3;

    public static void main(String[] args)
    {
        Street street = new Street(STREETSIZE,CARCOUNT);

        for (int i = 0; i < CARCOUNT; i++)
        {
            (new Car(i+1, street)).start();
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
