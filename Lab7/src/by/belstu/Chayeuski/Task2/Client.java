package by.belstu.Chayeuski.Task2;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Client extends Thread {
    private String name;
    private CallCenter callCenter;
    private Semaphore semaphore;

    public Client(CallCenter pCallCenter, Semaphore pSemaphore, int pName) {
        this.name = String.valueOf(pName);
        this.semaphore = pSemaphore;
        this.callCenter = pCallCenter;
    }

    public String getClientName() {
        return this.name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int waitingTime = rand.nextInt(600) + 100;
        System.out.println("Client " + this.getName() + " calling..");

        try {
            if (semaphore.tryAcquire(waitingTime, TimeUnit.MICROSECONDS)) {
                System.out.println("Client " + this.getClientName() + " have a dialog");
                callCenter.connect(this);
                callCenter.showLines();
                Thread.sleep(rand.nextInt(3000) + 500);
                callCenter.disconnect(this);
                semaphore.release();
                System.out.println("Client " + this.getClientName() + " end dialog");
            } else {
                System.out.println("Client " + this.getClientName() + " left");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
