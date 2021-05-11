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
public class Gallo extends Animal {

    private String color_plumas;

    public void show() {
        nombre = "Pedro";
        edad = 2;
        alimento = "Maicillo";
        color_plumas = "Rojo";

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Alimento: " + this.nombre);
        System.out.println("Nombre: " + this.color_plumas);

    }

}
