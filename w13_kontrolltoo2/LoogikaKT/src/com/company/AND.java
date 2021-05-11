package com.company;

public class AND implements Loogikaliides{
    boolean kanal1;
    boolean kanal2;
    boolean seisund;
    String nimi;

    public AND(boolean kanal1, boolean kanal2, String nimi) {
        this.kanal1 = kanal1;
        this.kanal2 = kanal2;
        this.nimi = nimi;
    }

    boolean seisund(){

        if(kanal1 == true && kanal2 == true){
            System.out.println(nimi+" true");
            seisund = true;
        }
        else{
            System.out.println(nimi+" false");
            seisund = false;
        }
        return seisund;
    }
}
