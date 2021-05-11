/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios;

import java.util.*;

/**
 *
 * @author carlo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa en java que solicite la información básica de acuerdo a los siguiente:
        //-> Nombres
        //-> Apellidos
        //-> Edad
        //-> Carrera
        //La información solicitada previamente deberá de ser impresa en consola.

        Scanner reader = new Scanner(System.in);
        
        String name;
        String lastName;
        int age;
        String career;
        
        System.out.print("ingree sus nombres: ");
        name = reader.nextLine();
        System.out.print("ingree sus apellidos: ");
        lastName = reader.nextLine();
        System.out.print("ingree su edad: ");
        age = Integer.parseInt(reader.nextLine());
        System.out.print("ingree su carrera: ");
        career = reader.nextLine();
        
        System.out.print("Nombre completo: " + name + " " + lastName + "\n" + "Edad: " + age + "\n" + "Carrera" + career);
    }
    
}
