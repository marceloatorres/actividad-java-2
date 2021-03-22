package com.company;

public class Fraccion {
    /*
        Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar y dividir
        fracciones. Todos los métodos deben estar sobrecargados de modo que también puedan
        usarse para operar entre fracciones y números enteros (por ejemplo: 3⁄5+2 o 5⁄8*4).
     */

    public static double sumar(double f, int n){
        return f +  n;
    }

    public static double sumar(double f, double n){
        return f +  n;
    }

    public static double restar(double f, int n){
        return f - n;
    }

    public static double restar(double f, double n){
        return f - n;
    }

    public static double multiplicar(double f, int n){
        return f * n;
    }

    public static double multiplicar(double f, double n){
        return f * n;
    }

    public static double dividir(double f, int n){
        if(n == 0)
            return -1;

        return f / n;
    }

    public static double dividir(double f, double n){
        if(n == 0)
            return -1;

        return f / n;
    }

}
