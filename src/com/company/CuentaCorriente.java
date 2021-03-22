package com.company;

public class CuentaCorriente {
    /*
    Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia.
    La clase contendrá un constructor por defecto, uno con parámetros y otro que recibirá una
    cuentaCorriente de la cual copiará de todos sus datos. Además se deben desarrollar los
    métodos de acceso (para cada variable de instancia de la clase, desarrollar un método set y
    otro get. Por ejemplo: si va clase tiene una variable double saldo, sus métodos de acceso
    serán: double getSaldo() y void setSaldo(double s). Los prototipos de los métodos y
    constructores deberán ser discutidos y diseñados en equipo.
     */

    private double saldo;
    private String numeroCuenta;

    public CuentaCorriente(){

    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.saldo = cuentaCorriente.getSaldo();
        this.numeroCuenta = cuentaCorriente.getNumeroCuenta();
    }

    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }

    public void ingreso(){

    }

    public void egreso(){

    }

    public void reintegro(){

    }

    public void transferencia(){

    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
