/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Contar;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Contar c1 = new Contar();
        Contar c2 = new Contar();

        c1.incrementar(teclado.nextInt());//asi se llama al metodo
        c1.decrementar(teclado.nextInt());
        c2.incrementar(teclado.nextInt());
        c2.decrementar(teclado.nextInt());

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("suma: " + c1.suma(c2));
        
        if (c2.equals(c1)) {
            System.out.println("c1 y c2 son iguales");
            
        }else {
            System.out.println("c1 y c2 no son iguales");
        }

    }

}
