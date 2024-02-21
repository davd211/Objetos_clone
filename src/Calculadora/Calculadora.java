/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author David.P
 */
public class Calculadora {

    private double Operador1;
    private double Operador2;

    public Calculadora() {
    }

    public Calculadora(double Operador1, double Operador2) {
        this.Operador1 = Operador1;
        this.Operador2 = Operador2;
    }


    public double getOperador1() {
        return Operador1;
    }

    public void setOperador1(double Operador1) {
        this.Operador1 = Operador1;
    }

    public double getOperador2() {
        return Operador2;
    }

    public void setOperador2(double Operador2) {
        this.Operador2 = Operador2;
        
    }

    
    public double suma (double a, double b){
    
        return a+b;
    
    }


   public double resta (double a, double b){
    
        return a-b;
    
    }
   public double multiplicacion (double a, double b){
    
        return a*b;
    
    }
    public double division (double a, double b){
    
        return a/b;
    
    }


    
   
    

    
    
}
