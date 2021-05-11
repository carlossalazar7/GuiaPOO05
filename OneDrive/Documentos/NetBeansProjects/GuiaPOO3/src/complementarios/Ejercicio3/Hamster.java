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
public class Hamster extends Animal {

    private int cantidad_pulga;

    public void show() {
        nombre = "Bola de nieve";
        edad = 3;
        alimento = "whiskas de hamster";
        cantidad_pulga = 15;

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Alimento: " + this.nombre);
        System.out.println("Cantidad de pulgas: " + this.cantidad_pulga);
    }
}
