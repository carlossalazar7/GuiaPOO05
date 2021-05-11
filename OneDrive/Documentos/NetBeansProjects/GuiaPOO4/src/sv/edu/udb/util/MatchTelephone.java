/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlo
 */
public class MatchTelephone {

    public static boolean compareTelephone(String telefono) {

        String expresion = "(2|7)\\d{3}-\\d{4}";
        Pattern pat = Pattern.compile(expresion);
        Matcher mat = pat.matcher(telefono);
        if (mat.matches()) {
            System.out.println("SI");
            return true;
        }

        return false;
    }
}
