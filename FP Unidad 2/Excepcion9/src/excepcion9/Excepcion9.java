/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion9;


public class Excepcion9 {

   
    public static void main(String[] args) {
       try {
            int dividend = 10;
            int divisor = 0;
            int result = divide(dividend, divisor);
            System.out.println("El resultado de la división es: " + result);
        } catch (ClassNotFoundException e) {
            System.out.println("¡Se produjo una ClassNotFoundException!");
            e.printStackTrace();
        }
    }

    public static int divide(int dividend, int divisor) throws ClassNotFoundException {
        if (divisor == 0) {
            throw new ClassNotFoundException("Divisor no puede ser cero.");
        }
        return dividend / divisor;
    }
}
