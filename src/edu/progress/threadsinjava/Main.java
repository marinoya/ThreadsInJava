package edu.progress.threadsinjava;

public class Main {

    public static void main(String[] args) {



        /*
        //conventional
        Thread t1 = new Thread(new AddThread());
	    // with lambda
        Thread t2 = new Thread(()->{
            while(true){
            System.out.println("I am lambda expression Tread");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        */

        AddToSumThread[] a = new AddToSumThread[5];
        Data d = new Data();
        for (int i = 0; i <a.length ; i++) {
            a[i] = new AddToSumThread(d, i+1);
            a[i].start();
        }

        /*
        for (int i = 0; i < 200 ; i++) {

            System.out.println(d.getSum());

        }
        */

        boolean wait = true;
        while (wait){
            wait = false;
            for (int i = 0; i <a.length ; i++) {
                wait = wait || !a[i].isReady();
            }
        }
        System.out.println(d.getSum());



    }
}
