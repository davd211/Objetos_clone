/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleado;

/**
 *
 * @author David.P
 */
public class MainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado e1 = new Empleado();
        System.out.println("Numero empleados: " + Empleado.getNumEmpleados());
        Empleado e2 = new Empleado();
        Empleado e3 = new Empleado();
        System.out.println("Numero empleados: " + Empleado.getNumEmpleados());

        if (e1.equals(e3)) {

            System.out.println("Empleados iguales");
        } else {

            System.out.println("Empleado no iguales");
        }

    }

}
