/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitriffiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ernes
 */
public class VITRIFFIV {

    
    public static void main(String[] args) throws IOException {
        
     BufferedReader bufEntrada =new BufferedReader (new InputStreamReader(System.in));
          
            int numero = 0;
            int mult3;
            int mult5;
            System.out.println("Dame el numero");
            numero = Integer.parseInt(bufEntrada.readLine());
          
           
           mult3= numero %3;
           mult5= numero %5;
           
           
           if (mult3 == 0){
               System.out.println("TRI");
           } else if (mult5 == 0){
               System.out.println("FIV");
           }else if (mult3 == 0&&mult5==0){
               System.out.println("TRIVFIV");
               
                   
           }
                 
    }
    
}