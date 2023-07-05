/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Excepcion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Ingrese el primer número: ");
            int num1 = Integer.parseInt(reader.readLine());
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = Integer.parseInt(reader.readLine());
            
            int result = multiplyUsingSum(num1, num2);
            System.out.println("El resultado de la multiplicación es: " + result);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numérico: Ingrese solo números enteros.");
        }
    }
    
    public static int multiplyUsingSum(int num1, int num2) {
        int result = 0;
        
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        
        return result;
    }
}
