package com.company;


public class Main {

    public static void main(String[] args) {
        boolean signal1 = true;
        boolean signal2 = false;

        AND gate1 = new AND(signal1, signal2,  "Esimene värav");

        AND gate2 = new AND(gate1.seisund(), false,  "Teine värav");

        OR gate3 = new OR(gate2.seisund(), gate1.seisund(), "Kolmas värav");

        OR gate4 = new OR(gate3.seisund(), false, "Neljas värav");

        NOT gate5 = new NOT(gate4.seisund(), "Viies värav") {};
    }
    void signal(int kanal, boolean signaal){

    }



}
