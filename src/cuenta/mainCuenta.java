/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de cuentas a crear");
        int numcuentas = teclado.nextInt();
        teclado.nextLine();

      //  Cuenta[] cuentas = new Cuenta[numcuentas];

        for (int i = 0; i < numcuentas; i++) {

            System.out.println("Cliente número " + (i+1));
            System.out.println("Introduce nombre del titular de la cuenta");
            String nombre = teclado.nextLine();

            System.out.println("Introduce ccc");
            String cuenta = teclado.nextLine();
            System.out.println("Introduce saldo inicial");
            int saldo = teclado.nextInt();
            System.out.println("Introduce tipo de interes");
            double interes = teclado.nextDouble();
            teclado.nextLine();

            Cuenta c1 = new Cuenta(nombre, cuenta, saldo, interes);

        }
        System.out.println("Numero de cuentas creadas es "+Cuenta.getNumCuentas());

    }

}

////para el proyecto de coche 
//coche c2 = (Coche) c1.clone(); // el parentesis
//Coche es porque me va a devolver una clase objeto por
//lo que hay que convertirlo a la clase coche 
//double b=3;
//float a =(float)b;
