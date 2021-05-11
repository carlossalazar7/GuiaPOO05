/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios.Ejercicio3;

/**
 *
 * @author carlo
 */
public class Perro extends Animal {
    private String color_pelaje;

    public void show() {
        nombre = "Rocky";
        edad = 5;
        alimento = "whiskas";
        color_pelaje = "Negro";

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Alimento: " + this.nombre);
        System.out.println("Alimento: " + this.color_pelaje);

    }

}
