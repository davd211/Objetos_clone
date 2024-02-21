/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contar;

/**
 *
 * @author David.P Crea una clase Contar (contador como atributo) con los
 * métodos para incrementar y decrementar el contador de la clase Contar. La
 * clase contendrá un constructor por defecto, un constructor con parámetros, y
 * los métodos getters y setters.
 *
 * void incrementar(int incremento)--> incrementando en la cantidad indicada en
 * "incremento" del atributo contador
 *
 * void decrementar (int decremento)--> decrementando en la cantidad indicada en
 * "decremento" del atributo contador
 *
 * int suma (Contar cont1)--> devuelve la suma de nuestro contador + contador
 * del objeto cont1
 *
 * En la clase principal, crear dos objetos (c1,c2) de la clase Contar con
 * costructor por defecto, y llamar a los métodos, incrementar y decrementar
 * para ambos objetos con los valores que introduzca por teclado el usuario.
 * Para posteriormente invocar a suma y mostrar el valor de ambos objetos por
 * pantalla.
 */
public class Contar {

    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Contar() {
    }

    public Contar(int contador) {
        this.contador = contador;
    }

    void incrementar(int incremento) { //void quiere decir que no me devuleve nada 
        this.contador += incremento;

    }

    ;

        
    void decrementar(int decremento) {
        this.contador -= decremento;

    }

    ;
        
     public int suma(Contar cont1) {
        return this.contador + cont1.getContador();
    }

    ;

    @Override
    public String toString() {
        return "Contar{" + "contador=" + contador + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contar other = (Contar) obj;
        return this.contador == other.contador;
    }


   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.contador;
        return hash;
    }

   
    
   
    
}
