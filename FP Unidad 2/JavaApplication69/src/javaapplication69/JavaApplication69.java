/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;


public class JavaApplication69 {

    
    public static void main(String[] args) {
      try {
          float equis = 5/10;
          System.out.println("Equis = " + equis);
      }catch (ArithmeticException e){
          System.out.println("Error: division entre cero.");
      }finally{
          System.out.println(" A pesar de todo, se ejecuta el bloque finally.");
          
      }
        
        
        
    }
    
}
