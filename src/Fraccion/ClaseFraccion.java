/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fraccion;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ClaseFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Fraccion f1 = new Fraccion(teclado.nextInt(), teclado.nextInt());
        Fraccion f2 = new Fraccion(teclado.nextInt(), teclado.nextInt());
        Fraccion resultadoS = f1.suma(f2);
        
         Fraccion resultadoD = f1.division(f2);
        System.out.println("División: " + resultadoD.getNumerador() + "/" + resultadoD.getDenominador());
    
    
        System.out.println("suma: " + resultadoS.getNumerador() + "/" + resultadoS.getDenominador());

        Fraccion resultadoR = f1.resta(f2);
        System.out.println("Resta: " + resultadoR.getNumerador() + "/" + resultadoR.getDenominador());
        Fraccion resultadoM = f1.multiplicacion(f2);
        System.out.println("Multiplicacion: " + resultadoM.getNumerador() + "/" + resultadoM.getDenominador());
      

        
        if (f1.equals(f2)) {
            System.out.println("f y f2 son iguales");
        }else{
            System.out.println("f y f2  no son iguales");
        }
}
}