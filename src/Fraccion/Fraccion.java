/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fraccion;

/**
 *
 * @author David.P
 */
public class Fraccion {

    private int denominador, numerador;

    public Fraccion suma(Fraccion f) {

        int numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        int denominador = this.denominador
                * f.denominador;

        Fraccion f1 = new Fraccion(numerador, denominador);
        return f1;

    }

    ;

    
    public Fraccion resta(Fraccion f) {
        int numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        int denominador = this.denominador * f.denominador;

        Fraccion f1 = new Fraccion(numerador, denominador);
        return f1;

    }

    ;

    
   public Fraccion multiplicacion(Fraccion f) {

        int numerador = this.numerador * f.numerador;
        int denominador = this.denominador * f.denominador;

        Fraccion f1 = new Fraccion(numerador, denominador);
        return f1;

    }

    ;

    
    public Fraccion division(Fraccion f) {
        int numerador = this.numerador * f.denominador;
        int denominador = this.denominador * f.numerador;

        Fraccion f1 = new Fraccion(numerador, denominador);
        return f1;

    }
 

    ;
    
  

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "denominador=" + denominador + ", numerador=" + numerador + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
        
    }

  
   

}
