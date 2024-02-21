/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cohete;



/**
 *
 * @author David.P
 */
public class Cohete implements Cloneable{
    
    
    private static int numCohete=0;

    public Cohete() {
        numCohete++;
    }

    public static int getNumCohete() {
        return numCohete;
    }

    /**
     *
     * @return
     */
    @Override
    protected Object clone() {
                Object o = null;

        try {
            o =  super.clone(); //ç
             numCohete++;
        } catch (CloneNotSupportedException ex) {
            System.out.println("fallo");
        }
        return o;
    }


    
    
    

    
}
