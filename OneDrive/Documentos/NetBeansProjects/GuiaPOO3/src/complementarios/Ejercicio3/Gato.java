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
public class Gato extends Animal {

    private String color_ojos;

    public void show() {
        nombre = "Roman";
        edad = 2;
        alimento = "whiskas";
        color_ojos = "Azul";

        //mostrar en consola
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Alimento: " + this.nombre);
        System.out.println("Color de ojos: " + this.color_ojos);
    }
}
