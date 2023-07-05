/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion10;

/**
 *
 * @author ernes
 */
public class Excepcion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            int numerator = 10;
            Object denominator = "2"; // Esto generará una ClassCastException
            
            int result = numerator / (int) denominator;
            System.out.println("El resultado de la división es: " + result);
        } catch (ClassCastException ex) {
            System.out.println("Se produjo una ClassCastException: " + ex.getMessage());
        }
    }
}
