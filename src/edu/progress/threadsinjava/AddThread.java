package edu.progress.threadsinjava;

public class AddThread implements Runnable {
    private int num;

    public AddThread() {
        num = 0;
    }

    @Override
    public void run() {
        while (num < 10000){
            System.out.println(num++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
