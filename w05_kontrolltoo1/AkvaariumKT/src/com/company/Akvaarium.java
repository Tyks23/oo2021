package com.company;
import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Akvaarium {
    float lenght;
    float width;
    float height;
    float water; //cm2

    public Akvaarium(float lenght, float width, float height, float water) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.water = water;// cm3
    }

    float volume() {

        //System.out.println("Akvaariumi ruumala on: "+ lenght*width*height+"cm3");
        return lenght * width * height;
    }

    float contWater() {
        //System.out.println("Akvaariumis on vett: "+ water+"cm3");
        return water;
    }

    void addWater(float addAmount) {

        this.water += addAmount; //cm3
        contWater();

    }

    void moveWaterFrom(Akvaarium tank1, float amount) throws InterruptedException {  //amount -> cm3
        // 1tank -> this.tank, amount
        float cmWarn = lenght * width * (this.height - 2);
        for (int i = 0; i < amount; i++) {
            TimeUnit.SECONDS.sleep(1);
            tank1.water -= 1;
            this.water += 1;

            if (this.contWater() >= cmWarn) {
                System.out.println("Kohe läheb üle!!");
                Scanner myObj = new Scanner(System.in);
                String userName = myObj.nextLine();
                cmWarn = 999999999;
            }
            else if (amount > tank1.water) {
                System.out.println("Pole nii palju vett");
            }
            else if (this.water > this.volume()) {
                System.out.println("Voolab üle");
            }
            System.out.println(tank1.water + " " + this.water);

        }
    }
}
