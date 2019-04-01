package edu.progress.threadsinjava;

public class Data {
    private int sum;

    public Data(){
        sum = 0;
    }

    public void addToSum( int toAdd){

        synchronized (this) {
            sum += toAdd;
        }
    }

    public int getSum(){
         return sum;
    }

}
