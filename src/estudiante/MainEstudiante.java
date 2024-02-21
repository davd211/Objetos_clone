/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class MainEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Estudiante e1 = new Estudiante();
        
        e1.setNombre(teclado.nextLine());
        e1.setDirección(teclado.nextLine());
        e1.setEdad(teclado.nextInt());
        e1.setNre(teclado.nextInt());
        
        
    }
    
}
