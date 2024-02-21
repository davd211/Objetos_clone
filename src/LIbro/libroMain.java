/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LIbro;

/**
 *
 * @author David.P
 */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class libroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
        Libro l1 = new Libro();
        l1.setTitulo(tec.nextLine());
        l1.setIsbn(tec.nextLine());
        l1.setAutor(tec.nextLine());
        
        System.out.println("--prestado--");
        l1.préstamo();
        System.out.println(l1.toString());
        
        System.out.println("--disponible--");
        l1.devolución();
        System.out.println(l1.toString());
        
        System.out.println("--Libro l2--");
        Libro l2 = new Libro();
        l2.setTitulo(tec.nextLine());
        l2.setIsbn(tec.nextLine());
        l2.setAutor(tec.nextLine());
        l2.devolución();
        System.out.println(l2.toString());
        
        if(l1.equals(l2)){
        
            System.out.println("l y l2 son iguales");
            
        } else {
        
            System.out.println("l y l2 no son iguales");
            
        }

    }

}