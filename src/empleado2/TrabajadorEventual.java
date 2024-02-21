/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado2;

/**
 *
 * @author David.P
 */
public class TrabajadorEventual extends Empleado{

    protected int añoContratacion;

    public int getAñoContratacion() {
        return añoContratacion;
    }

    public void setAñoContratacion(int añoContratacion) {
        this.añoContratacion = añoContratacion;
    }

   
    public TrabajadorEventual(int añoContratacion, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.añoContratacion = añoContratacion;
    }

  
    
    
    
    
    
    
    @Override
    public double calcularSueldo() {

        return 2000 + (añoContratacion-2024)*30.5;

    }
    
}
