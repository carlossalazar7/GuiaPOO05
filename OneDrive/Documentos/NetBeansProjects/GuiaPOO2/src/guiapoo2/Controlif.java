/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Controlif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int Var1, Var2;
        
        System.out.print("Ingrese numero1: ");
        Var1 = reader.nextInt();
        System.out.print("Ingrese numero2: ");
        Var2 = reader.nextInt();
        
        
        if (Var1 == Var2) {
            System.out.print("Los numeros ingresados son iguales ");
        } else {
            System.out.println("Los numeros ingresados No son iguales ");
        }

    }

}
