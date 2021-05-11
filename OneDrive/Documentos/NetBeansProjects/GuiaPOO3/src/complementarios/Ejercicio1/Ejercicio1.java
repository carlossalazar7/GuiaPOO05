/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios.Ejercicio1;

import complementarios.Ejercicio1.Student;

/**
 *
 * @author carlo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instanciar objetos
        Student est = new Student("Carlos", "Salazar", "Téc. en Computación", 20);
      
        est.ingresarMaterias();
        
        System.out.println("Nombre: " + est.getNombre() + "\nApellido: " + est.getApellido() + "\nCarrera: " + est.getCarrera() + "\nEdad: " + est.getEdad() + "\n");
        System.out.println("Materia1: " + est.getMateria1());
        System.out.println("Materia2: " + est.getMateria2());
        System.out.println("Materia3: " + est.getMateria3());
        System.out.println("Materia4: " + est.getMateria4());
        System.out.println("Materia5: " + est.getMateria5());

    }

}
