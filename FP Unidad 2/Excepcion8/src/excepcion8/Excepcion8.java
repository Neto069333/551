
package excepcion8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Excepcion8 {

  
    public static void main(String[] args) {
       try {
            Scanner scanner = new Scanner(new File("input.txt"));
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("El resultado de la división es: " + result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}
