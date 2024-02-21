/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perro;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainperro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner teclado= new Scanner(System.in);
        Perro perro1 = new Perro();
        
        perro1.setColor(teclado.next().charAt(0));
        perro1.setEdad(teclado.nextInt());
        
                System.out.println( perro1.toString());


    }
    
}
