/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo1;

import java.util.*;

/**
 *
 * @author carlo
 */
public class LecturaConsola {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = "";
        int edad;

        System.out.print("ingree su nombre: ");
        name = reader.nextLine();
        System.out.print("ingrese su  edad: ");
        edad = reader.nextInt();

        System.out.print("name:" + name + "\n");
        System.out.print("edad:" + edad);
    }

}
