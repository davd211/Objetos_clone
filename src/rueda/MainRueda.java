/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rueda;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class MainRueda {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Rueda r1 = new Rueda(50, 50, 0);
        Rueda r2 = new Rueda(r1);

        r1.setAnchura(88);

        //R2Rueda{anchura=88, perfil=50, diametroLlanta=50}
        System.out.println("R1Rueda{ anchura=" + r1.getAnchura() + ", perfil=" + r1.getPerfil() + ", diametroLlanta=" + r1.getDiametroLlanta() + "}");
        System.out.println("R2Rueda{ anchura=" + r2.getAnchura() + ", perfil=" + r2.getPerfil() + ", diametroLlanta=" + r2.getDiametroLlanta() + "}");

    }

}
