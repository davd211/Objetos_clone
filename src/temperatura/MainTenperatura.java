/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

public class MainTenperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Temperatura t1 = new Temperatura();

        double celsius = teclado.nextDouble();

        double fahrenheit = t1.celsiusToFarenheit(celsius);
        System.out.println(fahrenheit);

    }
}
