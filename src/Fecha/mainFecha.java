/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fecha;
import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainFecha {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

 
        Scanner sc = new Scanner(System.in);

        // Pedir datos por teclado
        

        // Crear objeto Fecha
        Fecha fecha = new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Fecha f2 = new Fecha(sc.nextInt(),sc.nextInt(),sc.nextInt());

        
          if (fecha.equals(f2)){
        
            System.out.println("f y f2 son iguales");
        }else{
            System.out.println("f y f2 no son iguales");
        }
        // Comprobar si la fecha es correcta
        if (fecha.fechaCorrecta()==true) {

            // Mostrar el día siguiente
            fecha.diaSiguiente();
            System.out.println( fecha);
        } else {
            System.out.println("Fecha incorrecta");
        }
        
      
    }
}