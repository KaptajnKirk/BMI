package com.company;


import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Introducer BMI beregner
        System.out.println("Velkommen til BMI-beregneren");

        //Indtast højde
        System.out.println("Indtast venligst din højde i meter");
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double højde = sc.nextDouble();
        //Indtast vægt
        System.out.println("Indtast venligst din vægt i kilo");
        double vægt = sc.nextDouble();

        //Udregn BMI

        double BMI = vægt / (højde * højde);

        System.out.print( "Din BMI er:" );
        System.out.println( BMI );

        if (BMI < 18.5) {
            System.out.println("Du er undervægtig");
        } else if (BMI < 25) {
            System.out.println("Du er normalvægt");
        } else if (BMI < 30) {
            System.out.println("Du er overvægtig");
        } else {
            System.out.println("Du er svært overvægtig");
        }

    }
}

