/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperatura;


public class Temperatura {
    
    public double celsiusToFarenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    public double farenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}

