package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Fecha {
    /*
        Crea una clase Fecha. La clase contendrá además de los constructores que consideres
        adecuados, métodos de acceso y el método toString, tal como lo explicamos en el ejercicio
        anterior, un método para comprobar si la fecha es correcta y otro para sumarle un día al valor
        actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar para implementar
        los métodos y constructores de Fecha.
     */

    private int dia;
    private int mes;
    private int anio;


    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean validarFecha(){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(this.dia + "/" + this.mes + "/" + this.anio);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }

    public void incrementarDia(){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.set(this.anio, this.mes, this.dia);
        gCalendar.add(GregorianCalendar.DAY_OF_MONTH, 29);
        this.dia = gCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = gCalendar.get(GregorianCalendar.MONTH);
        this.anio = gCalendar.get(GregorianCalendar.YEAR);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString(Fecha fecha){
        return fecha.dia + "/" + fecha.mes + "/" + fecha.anio;
    }
}
