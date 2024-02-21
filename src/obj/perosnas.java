/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author David.P
 */
public class perosnas {
    
}
class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private static int numPersonas = 0;

    Persona() {
        this.dni = "sin dni";
        this.nombre = "sin nombre";
        this.edad = 1;
        nuevaPersona();
    }
    Persona(String dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        nuevaPersona();
    }
   
    public static void nuevaPersona(){
        numPersonas++;
    }
    public String getDni(){
        return this.dni;  
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
        
    }
    
    public static void getNumPersonas(){
        System.out.println(numPersonas);
    }
    
    
    
    
}
