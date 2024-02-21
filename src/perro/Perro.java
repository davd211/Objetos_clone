/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perro;

/**
 *
 * @author David.P
 */
public  class Perro {
    
    private char color;
    private int edad;

    public Perro() {
    }

    public Perro(char color, int edad) {
          if (color == 'b' || color == 'n'){
        this.color = color;}else {
              System.out.println("Color no establecido");
          }
        this.edad = edad;
    }
    
    

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String colorString;
        switch (color) {
            case 'b':
                colorString = "Blanco";
                break;
            case 'n':
                colorString = "Negro";
                break;
            default:
                colorString = "Color no establecido";
                break;
        }
        return "Perro{color=" + colorString + ", edad=" + edad + "}";
    
    
    }
}
