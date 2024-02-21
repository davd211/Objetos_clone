/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David.P
 */
public class Rectangulo implements Cloneable{

    private String nombre;
    private double ancho;
    private double alto;
    
    //cada constructor y getter and setter son metodos.
    
    public Rectangulo(){ //Este es el constructor por defecto 
    
    }

    public String getNombre() {   // en el momento que hay un return hay que especificar el tipo de dato como int o string o etc...
        return this.nombre;
    }

    public Rectangulo(String nombre, double ancho, double alto) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Rectangulo (Rectangulo r){  // el constructor copia 
    this.nombre = r.getNombre();
    this.alto = r.getAlto();
    this.ancho = r.getAncho();
    }
 
    public void setNombre(String nombre) {  
// el void se pone cuando se va a introducir los datos 
// no me esta devolviendo informacion con la que le paso se le asigna 
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    

    @Override // esto esta puesto porque viene del metodo padre.
    public String toString() {
        return "Rectangulo{" + "nombre=" + nombre + ", ancho=" + ancho + ", alto=" + alto + '}';
    }

    @Override
    protected Object clone(){  // Se pone la variable Object para que no se queden los dos returns juntos,
      //  por lo que habia que cambiar inicializar la clase objeto con la variable la inciamos a null, le asignamos el null "o =  super.clone();"
      //y finalmente le modificamos el retun del final cambiamos el null por o que seria lo mismo solo que lo que hace es que hacemos que cuando de un 
      //fallo el programa el fallo no lo tarte netbeans si no nosotrso y el programa se cierre y nos de un erro exacto.

        Object o = null;
        
        try {
            o =  super.clone(); 
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Rectangulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }


}
