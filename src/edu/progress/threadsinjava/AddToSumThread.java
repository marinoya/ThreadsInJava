package edu.progress.threadsinjava;

public class AddToSumThread extends Thread {

    private Data data;
    private int addUmber;
    private boolean isReady;

    public AddToSumThread(Data data, int numberToAdd){
        this.data = data;
        this.addUmber = numberToAdd;
        this.isReady = false;
    }


    @Override
    public void run(){
        for (int i = 0; i < 10000 ; i++) {
            data.addToSum(addUmber);
        }
        isReady = true;
    }

    public boolean isReady() {
        return isReady;
    }
}
