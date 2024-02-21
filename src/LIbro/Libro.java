/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIbro;

import java.util.Objects;

/**
 *
 * @author David.P Crea una clase Libro, con los atributos titulo, isbn, autor
 * (todos String) y atributo prestado (boolean) y con los métodos préstamo,
 * devolución y toString. La clase contendrá un constructor por defecto, un
 * constructor con parámetros (en ambos el atributo prestado será igual a false,
 * con lo que no tendremos que pasar su valor como parámetro) y los métodos
 * getters y setters
 */
public class Libro {

    private String titulo, isbn, autor;
    private boolean prestado;
    private String  estado;

    public Libro() {
        this.prestado = false;

    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    void  préstamo (){
     this.prestado = true;
      estado= " está prestado";
    
    };
    
    void devolución() {
     this.prestado = false;
      estado= " está disponible";
    
    
    };

    @Override
    public String toString() {
        return "El libro " +  titulo + ", del autor " + autor + " con isbn " + isbn  + estado ;
    }
    
    //El libro La madre de Frankenstein, del autor ALMUDENA GRANDES con isbn 9788490667804 está prestado

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.isbn);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + (this.prestado ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.estado);
        return hash;
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
        final Libro other = (Libro) obj;
        if (this.prestado != other.prestado) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }

   
    
    

    
    
    
    
    
}
