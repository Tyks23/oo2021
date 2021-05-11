package com.company;

public class Pendel{

    double pikkus;
    double vonkePeriood;

    public Pendel(double pikkus, Hammasratas hammasratas){

        this.pikkus=pikkus;
    }
    public void Pendeldamine( double pikkus, Hammasratas hammasratas){
        vonkePeriood = 2 * Math.PI * Math.sqrt(pikkus/9.8);
        while (true) {
            try {
                Thread.sleep(Math.round(vonkePeriood * 100));
                System.out.println("tiks");
                hammasratas.tick();
            } catch(InterruptedException e) {
                System.out.println("Midagi valesti");
            }
        }
    }
}
