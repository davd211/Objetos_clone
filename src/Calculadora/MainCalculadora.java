/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author David.P
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora c1 = new Calculadora();

        try {
            c1.setOperador1(teclado.nextDouble());
            c1.setOperador2(teclado.nextDouble());

            teclado.nextLine();
            String caracter = teclado.nextLine();
            double resultado = 0;
            switch (caracter) {
                case "+":
                    resultado = c1.suma(c1.getOperador1(), c1.getOperador2());
                    break;

                case "-":
                    resultado = c1.resta(c1.getOperador1(), c1.getOperador2());
                    break;

                case "*":
                    resultado = c1.multiplicacion(c1.getOperador1(), c1.getOperador2());
                    break;

                case ":":
                    resultado = c1.division(c1.getOperador1(), c1.getOperador2());
                    break;
                  
        }

    } catch (InputMismatchException ex) {
        System.out.println("Dato introducido erróneo");
            double resultado = 0;
         System.out.printf("Resultado: %.2f\n", resultado);

    }
    }

}
