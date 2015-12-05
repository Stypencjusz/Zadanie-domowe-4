package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double c,rata;
        int r;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj cene towaru");
        c = odczyt.nextDouble();
        while (c<100 || c >10000){
            System.out.println("Podano zla cene wybierz cene z zakresu 100 z³ 10000z³");
            c = odczyt.nextDouble();
        }
        System.out.println("Podaj liczbe rat");
        r = odczyt.nextInt();
        while (r<6 || r>48){
            System.out.println("Podano zla liczbe rat wybierz od 6 do 48");
            r = odczyt.nextInt();
        }
        odczyt.close();
        DecimalFormat df = new DecimalFormat("#.00");
            if (r<12) {
                rata=(c+1+(0.025*r/12))/r;
                System.out.println("Rata z odestekami wynosi "+df.format(rata));
            }
            if (r>13 && r<24) {
                rata=(c+1+(0.05*r/12))/r;
               System.out.println("Rata z odestkami wynosi "+df.format(rata));
            }
        if (r>25) {
            rata=(c+1+(0.1*r/12))/r;
            System.out.println("Rata z odestkami wynosi "+df.format(rata));
        }
        System.out.println("");
    }

}

