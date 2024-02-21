/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenataCorriente;
//
//import java.util.Scanner;
//
///**
// *
// * @author David.P
// */
//public class cuentacorrienteMain {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//        CuentaCorriente ccc2 = new CuentaCorriente("ES182844328901234586891", 2, 3000);
//
//        int num = 0;
//
//        do {
//            System.out.println("0. Crear cuenta\n"
//                    + "1. Ingresar en la CCC\n"
//                    + "2. Reintegro en la CCC\n"
//                    + "3. Transferencia en la CCC\n"
//                    + "4. Consultar saldos\n"
//                    + "5. Salir");
//            num = teclado.nextInt();
//            teclado.nextLine();
//            num = 0;
//            CuentaCorriente ccc1 = null; // el null es para cuando tenemso que crear un objeto qu epuede ser utilizado en varios apartados, 
//            //una vez ya existe ccc1 ya no estaria a null por lo que se pueden hacer las demas opciones porque ya exixte 
//
//            switch (num) {
//
//                case 0:
//
//                    ccc1 = new CuentaCorriente(teclado.nextLine(), teclado.nextDouble(), teclado.nextDouble());
//
//                case 1:
//                    if (ccc1 != null) {
//                        ccc1.ingresoccc(teclado.nextInt());
//                    }
//
//                case 2:
//                    if (ccc1 != null) {
//                        ccc1.reintegroccc(teclado.nextDouble());
//                    }
//
//                case 3:
//                    if (ccc1 != null) {
//                        ccc2.transferenciaccc(teclado.nextDouble(), ccc2);
//                    }
//
//                case 4:
//                    if (ccc1 != null) {
//
//                        System.out.print(ccc1.toString() + "\n");
//                        System.out.print(ccc2.toString() + "\n");
//                    }
//
//                case 5:
//                    break;
//            }
////        
////    
////        }} 