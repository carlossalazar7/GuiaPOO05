/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo3;

/**
 *
 * @author carlo
 */
public class Arboles {

    //Constructores sin parametros
    public Arboles() {
        System.out.println("Un árbol genérico \n");
    }

    //Constructores con un parametro string
    public Arboles(String tipo) {
        System.out.println("Un árbol tipo: " + tipo);
    }

    //Constructores con un parámetro int
    public Arboles(int altura) {
        System.out.println("\n Un árbol de: " + altura + "metros");
    }

    //Constructores con 2 parámetros int/String
    public Arboles(int altura, String tipo) {
        System.out.println("Un " + tipo + " de " + altura + " metros");
    }

    public static void main(String[] args) {
        //Objeto1
        Arboles arbol1 = new Arboles(4);

        //Objeto2
        Arboles arbol2 = new Arboles("Roble");

        //Objeto3
        Arboles arbol3 = new Arboles();

        //Ojeto4
        Arboles arbol4 = new Arboles(5, "Pino");

    }
}
