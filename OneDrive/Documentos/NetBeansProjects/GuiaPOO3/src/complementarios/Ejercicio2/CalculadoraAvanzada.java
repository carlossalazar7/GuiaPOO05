/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios.Ejercicio2;

/**
 *
 * @author carlo
 */
public class CalculadoraAvanzada {

    public int numero1;
    public int numero2;
    int resultado;
    //Constructor

    CalculadoraAvanzada(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    //Getter y Setter
    int getNumero1() {
        return numero1;
    }

    void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    int getNumero2() {
        return numero2;
    }

    void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Metodos
    public int potencia(int base, int exponente) {
        try {
            resultado = (int) Math.pow(base, exponente);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public int opuesto(int n1) {
        try {
            resultado = (-n1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public int factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return (int) (numero * factorial(numero - 1));
        }
    }
}
