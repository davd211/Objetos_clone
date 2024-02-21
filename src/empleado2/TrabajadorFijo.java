/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado2;

/**
 *
 * @author David.P
 */
public class TrabajadorFijo extends Empleado{
    
    protected int añosExperiencia;

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }



    public TrabajadorFijo(int añosExperiencia, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.añosExperiencia = añosExperiencia;
    }

    public TrabajadorFijo() {
    }

    
    

    @Override
    public double calcularSueldo() {
        return 2000 + añosExperiencia*30.5;//en los decimales poner un punto no una coma
    }
    
    
    
    
}
