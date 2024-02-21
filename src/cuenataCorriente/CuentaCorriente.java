/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenataCorriente;

/**
 *
 * @author David.P
 */
public class CuentaCorriente {

    private String nombre;
    private String ncuenta;
    private double tipodeinteres;
    private double saldo;

    public void ingresoccc(double importe) {
        this.saldo = this.saldo + importe + ((this.tipodeinteres / 100) * this.saldo);
    }

    
    
    public void reintegroccc(double importe) {

        if (importe > saldo) {

            System.out.println("Saldo insuficiente");
        }
    }

    public void transferenciaccc(double cantidad, CuentaCorriente c1){

        c1.ingresoccc(cantidad);
        this.saldo = this.saldo-cantidad;
        
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String ncuenta, double tipodeinteres, double saldo) {
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.tipodeinteres = tipodeinteres;
        this.saldo = saldo;
    }

    public CuentaCorriente(String ncuenta, double tipodeinteres, double saldo) {
        this.ncuenta = ncuenta;
        this.tipodeinteres = tipodeinteres;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public double getTipodeinteres() {
        return tipodeinteres;
    }

    public void setTipodeinteres(double tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public CuentaCorriente(CuentaCorriente cun1){
         
        // pasamos a cada variable lo que contiene
        // el cada persona...
         this.nombre = cun1.nombre;
        this.ncuenta = cun1.ncuenta;
        this.tipodeinteres = cun1.tipodeinteres;
        this.saldo = cun1.saldo;
       
    }
}
