/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.util.Objects;

/**
 *
 * @author David.P Crea una clase Empleado (dni, nombre, sueldo). La clase
 * contendrá un atributo estático o atributo de clase (numEmpleados)
 *
 * Constructor por defecto, setters y getters.
 *
 * Crear la clase principal, donde crearemos un empleado con constructor por
 * defecto, y mostraremos el número de empleados. A continuación creamos otros
 * dos empleados y volvemos a mostrar cuantos empleados hay
 */
public class Empleado {

    private String dni;
    private String nombre;
    private double sueldo;
    public static int numEmpleados = 0;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }

    public Empleado() {
        numEmpleados++;
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
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.dni);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
    

}
