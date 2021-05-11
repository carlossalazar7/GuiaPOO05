/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios.Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Student {

    //declaracion de variables globales
    String nombre;
    String apellido;
    String carrera;
    int edad;

    //declaracion de varibles utilizadas unicamente en la clase
    String materia1;
    String materia2;
    String materia3;
    String materia4;
    String materia5;

    //Getter y Setter
    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getApellido() {
        return apellido;
    }

    void setApellido(String apellido) {
        this.apellido = apellido;
    }

    String getCarrera() {
        return carrera;
    }

    void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    String getMateria1() {
        return materia1;
    }

    void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    String getMateria2() {
        return materia2;
    }

    void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    String getMateria3() {
        return materia3;
    }

    void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    String getMateria4() {
        return materia4;
    }

    void setMateria4(String materia4) {
        this.materia4 = materia4;
    }

    String getMateria5() {
        return materia5;
    }

    void setMateria5(String materia5) {
        this.materia5 = materia5;
    }

    public Student() {

    }

    //Constructor
    Student(String nombre, String apellido, String carrera, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = edad;
    }

    //método para ingresar las 5 materias
    public void ingresarMaterias() {

        materia1 = JOptionPane.showInputDialog("Ingrese la materia 1: ");
        materia2 = JOptionPane.showInputDialog("Ingrese la materia 2: ");
        materia3 = JOptionPane.showInputDialog("Ingrese la materia 3: ");
        materia4 = JOptionPane.showInputDialog("Ingrese la materia 4: ");
        materia5 = JOptionPane.showInputDialog("Ingrese la materia 5: ");

    }

    public void all() {

        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
        carrera = JOptionPane.showInputDialog("Ingrese la carrera: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        materia1 = JOptionPane.showInputDialog("Ingrese la materia 1: ");
        materia2 = JOptionPane.showInputDialog("Ingrese la materia 2: ");
        materia3 = JOptionPane.showInputDialog("Ingrese la materia 3: ");
        materia4 = JOptionPane.showInputDialog("Ingrese la materia 4: ");
        materia5 = JOptionPane.showInputDialog("Ingrese la materia 5: ");

    }

}
