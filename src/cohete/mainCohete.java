/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cohete;

/**
 *
 * @author David.P
 */
public class mainCohete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cohete c1 = new Cohete();
        Cohete c2 = (Cohete) c1.clone();
        Cohete c3 = (Cohete) c1.clone();
        Cohete c4 = (Cohete) c1.clone();
        
        
        System.out.println(c1.getNumCohete());
        System.out.println(c3.getNumCohete());
        
    }
    
}
