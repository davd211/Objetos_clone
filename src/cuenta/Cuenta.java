/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author David.P
 */
public class Cuenta {
private String nombre;
private String cuenta;
private int Saldo;
private double TipoInteres;
private static int numCuentas=0;

    public Cuenta() {
        numCuentas++;
    }

    public Cuenta(String nombre, String cuenta, int Saldo, double TipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.Saldo = Saldo;
        this.TipoInteres = TipoInteres;
        numCuentas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public double getTipoInteres() {
        return TipoInteres;
    }

    public void setTipoInteres(double TipoInteres) {
        this.TipoInteres = TipoInteres;
    }

    public static int getNumCuentas() {
        return numCuentas;
    }


    
    
    
}
