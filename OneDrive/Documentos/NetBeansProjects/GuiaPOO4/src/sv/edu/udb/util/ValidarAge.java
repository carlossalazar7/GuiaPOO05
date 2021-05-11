/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.util;

/**
 *
 * @author carlo
 */
public class ValidarAge {

    public static boolean Age(int age) {
        if (age <= 0) {
            System.out.println("SI");
            return true;
        }
        return false;
    }
}
