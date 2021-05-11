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
public class CalculadoraBasica {

    //declaracion de variables
    private int numero1;
    private int numero2;
    int resultado;

      //Constructor
    CalculadoraBasica(int n1, int n2) {
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
    public int sumar(int n1, int n2) {
        try {
            resultado = n1 + n2;
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public int restar(int n1, int n2) {
        try {
            resultado = n1 - n2;
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public int dividir(int n1, int n2) {
        try {
            resultado = n1 / n2;
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public int multiplicar(int n1, int n2) {
        try {
            resultado = n1 * n2;
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

}
