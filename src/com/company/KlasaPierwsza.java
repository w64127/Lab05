package com.company;

public class KlasaPierwsza {
    public void dodaj(int a, int b){
        System.out.println("ints: " + (a+b));
    }
    public void dodaj(float a, float b){
        System.out.println("floats: " + (a+b));
    }
    public void dodaj(int a, float b){
        System.out.println("int and float: " + (a+b));
    }
    public void dodaj(double a, double b){
        System.out.println("doubles: " + (a+b));
    }
    public void dodaj(long a, long b){
        System.out.println("longs: " + (a+b));
    }
    public void dodaj(short a, short b){
        System.out.println("shorts: " + (a+b));
    }
}
