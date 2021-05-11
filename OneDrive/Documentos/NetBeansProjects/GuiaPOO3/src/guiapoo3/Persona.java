/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo3;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    //Atributos
    private String nombre;
    private String apellido;
    private String edad;
    //contructor por sin parametros
    //se utiliza al instanciar el objeto

    public Persona() {
        nombre = "Carlos";
        apellido = "Peñate";
        edad = "20";
    }
    //Contructor con parametros

    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //permitir definir datos a los atributos
    public void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
        edad = JOptionPane.showInputDialog("Ingrese su edad");
    }

    //permitir imprimir los valores de los atributos
    public void mostrarDatos() {
        System.out.print("Su nombre es:" + this.nombre);
        System.out.print("\n Su apellido es:" + apellido);
        System.out.print("\n Su edad es:" + edad);
        System.out.println("****************************");
    }

    public static void main(String[] args) {
        //instanci del objeto p1
        Persona obj1 = new Persona();
        //instancia del objeto p2
        Persona obj2 = new Persona("Eduardo", "Salazar", "20");
        //LLamamos a el método mostrar datos de obj1
        obj1.mostrarDatos();
        //Cambiamor valor a los atributos de obj1
        obj1.ingresoDatos();
        //LLamamos a el método mostrardatos de obj1
        obj1.mostrarDatos();
        //LLamamos a el metodomostrardatos de obj2
        obj2.mostrarDatos();
        obj1.apellido = "Sanchez";
        obj1.mostrarDatos();

    }

}
