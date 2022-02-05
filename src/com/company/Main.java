package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //exercise1
        KlasaPierwsza kl1 = new KlasaPierwsza();

        kl1.dodaj(5,6);

        //exercise2
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        try{
            Double.parseDouble(a);
            try{
                System.out.println(Math.sqrt(Double.parseDouble(a)));
            }catch(IllegalArgumentException ex2){
                System.out.println("Podano ujemna liczbe.");
            }
        }catch(NumberFormatException ex1){
            System.out.println("Podana wartosc nie jest liczba.");
        }

        //exercise3

        try{
            Exercise3 ob1 = new Exercise3();
            ob1.lenght(null);
        }catch(NullPointerException ex){
            ex.printStackTrace(System.out);
            ex.fillInStackTrace();
            throw new Exception(ex);
        }

    }
}
