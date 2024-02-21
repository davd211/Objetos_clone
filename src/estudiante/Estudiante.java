/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author David.P
 */
public class Estudiante {

   private String nombre;
   private String dirección;
   private int edad;
   private int nre;
   
   public Estudiante(){ // constructor por defecto 
   
   }

    public Estudiante(String nombre, String dirección, int edad, int nre) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.edad = edad;
        this.nre = nre;
    }
   
   
   
   
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNre() {
        return nre;
    }

    public void setNre(int nre) {
        this.nre = nre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", direcci\u00f3n=" + dirección + ", edad=" + edad + ", nre=" + nre + '}';
    }
   
   
}
