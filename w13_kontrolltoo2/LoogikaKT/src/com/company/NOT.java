package com.company;

public abstract class NOT implements Loogikaliides{
    boolean kanal1;
    boolean seisund;
    String nimi;

    public NOT(boolean kanal1, String nimi) {
        this.kanal1 = kanal1;
        this.nimi = nimi;
    }

    boolean seisund(){

        seisund = !kanal1;
        System.out.println(nimi + Boolean.toString(seisund));
        return seisund;
    }
}
