package com.company;

public class Main {

    public static void main(String[] args) {
	    RelvagaKangelane1 Kalevipoeg = new RelvagaKangelane1("Kalevipoeg", 23, "Laud", 90);
        RelvagaKangelane1 Kurimees = new RelvagaKangelane1("Kurimees", 24, "Kartulikott", 25);

        Kalevipoeg.jutusta("Näe! Tõin kapsast!");
        Kurimees.jutusta("Aga ma ei tahtnud kapsast, ma tõin juba kartulit!");

        Kurimees.look();
        Kalevipoeg.blokk();


    }
}
