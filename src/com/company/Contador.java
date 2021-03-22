package com.company;

public class Contador {
    /*
        Crea una clase Contador (sí, contador de programación) con métodos que permitan
        incrementar y decrementar su valor. La clase contendrá un constructor por defecto, un
        constructor con parámetros, un constructor copia y los setters y getters (métodos de acceso)
        que corresponda.
     */

    private int valorContador = 0;

    public Contador(){

    }

    public Contador(int valorContador){
        this.valorContador = valorContador;
    }

    public Contador(Contador contador){
        this.valorContador = contador.getValorContador();
    }

    public void incrementar() {
        this.valorContador++;
    }

    public void decrementar() {
        this.valorContador--;
    }

    public void setValorContador(int valorContador) {
        this.valorContador = valorContador;
    }

    public int getValorContador() {
        return valorContador;
    }
}
