package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // write your code here
        Akvaarium akv1 = new Akvaarium(12, 23, 34, 8830);
        Akvaarium akv2 = new Akvaarium(12, 23, 34, 999999);

        System.out.println("millise osa demo");
        Scanner myObj = new Scanner(System.in);
        int select = Integer.parseInt(myObj.nextLine());

        switch (select) {
            case 1:
                System.out.println("Akvaariumi ruumala on "+ akv1.volume() +"cm3");
                break;
            case 2:
                System.out.println("Kui palju vett akvaariumisse lisada tahad?");
                Scanner myObj2 = new Scanner(System.in);
                float amount = Float.parseFloat(myObj.nextLine());
                System.out.println("Enne oli akvaariumis "+ akv1.contWater()+ "cm3 vett");
                akv1.addWater(amount);
                System.out.println("Nüüd on "+ akv1.contWater() +"cm3");
                break;
            case 3:
                akv1.moveWaterFrom(akv2, 99999);
                break;

        }
    }
}

/*
 * Loo klass akvaariumi tarbeks. Konstruktori sisendiks pikkus, laius ja kõrgus (cm). Koosta käsklus ruumala väljastamiseks.
 *
 * Akvaariumi eksemplar hoiab meeles sees hoitava vee kogust. Käsuga saab vett lisada. Käsuga saab küsida, et kui palju on selles akvaariumis vett.
 *
 * Akvaariume on mitu. Koosta käsklus määratud koguse vee valamiseks ühest akvaariumist teise. Kui akvaariumi servani jääb vähem kui kaks vaba sentimeetrit, väljastatakse hoiatus.
 */