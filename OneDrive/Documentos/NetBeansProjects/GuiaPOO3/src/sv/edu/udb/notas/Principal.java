/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.notas;

/**
 *
 * @author carlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est = new Estudiante("Walter", "Samuel");

        //asignacióm de valores por medio de Setter
        est.setNota1(11);
        est.setNota2(15);
        est.setNota3(10);

        System.out.println("Notas de " + est.nombre + " " + est.getApellido());
        //extracción de datos por medio de Getter
        System.out.println("Nota 1: " + est.getNota1());
        System.out.println("Nota 2: " + est.getNota2());
        System.out.println("Nota 3: " + est.getNota3());
    }

}
