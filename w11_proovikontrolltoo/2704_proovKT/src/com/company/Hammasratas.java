package com.company;

public class Hammasratas {
    long hammasTotal;
    long hammas = 1;
    long counter;
    int sekundKetas = 96;
    int[] minutiKetas = {90, 8};
    int[] tunniketas = {78, 13};

    int sekundHammas = 1;
    int[] minutiHammas = {1, 1};
    int[] tunniHammas = {1, 1};


    public Hammasratas(long hammasTotal){
        this.hammasTotal = hammasTotal;

    }

    public void tick(){
        if(hammas < hammasTotal){
            hammas++;
        }else {
            hammas = 1;
            counter++;
            System.out.println("ring tehtud");
        }
    }
    public void kell() throws InterruptedException {
        while(true){
            Thread.sleep(500);
            sekundHammas++;

            switch()
        }
    }
}
