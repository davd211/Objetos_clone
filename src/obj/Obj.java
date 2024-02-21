/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obj;

/**
 *
 * @author David.P
 */
public class Obj {

    /**
     * @param args the command line arguments
     */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona();
        Persona p2 = new Persona("77789898m","Pepe",5);
        Persona p3 = new Persona();
        p2.setNombre("Jose");
        p2.setEdad(3);
        p2.setDni("0");
       
        System.out.println(p.getNombre());
        System.out.println(p2.getNombre());
        p.getNumPersonas();
        p2.getNumPersonas();
    }
    
}
    
    

