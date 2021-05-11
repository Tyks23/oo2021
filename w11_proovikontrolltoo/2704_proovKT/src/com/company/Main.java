package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Sisesta pikkus:");
        double pikkus = Double.parseDouble(myObj.nextLine());

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Sisesta hammasrattad:");
        Hammasratas hammasrattad = new Hammasratas(Long.parseLong(myObj2.nextLine()));



        Pendel pendel = new Pendel(pikkus, hammasrattad);

        System.out.println("Võnkeperiood on: " + pendel.vonkePeriood);

        pendel.Pendeldamine(pendel.pikkus, hammasrattad);


    }
}

