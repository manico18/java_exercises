/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATIAS
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
        // números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
        // aparezca un 3 lo sustituya por una E. Nota: investigar función equals() 
        // y como convertir números a String.
        
        int i,j,k,num;
        String le;
       
        
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                for (k  = 0; k < 9; k++) {
                    
                  num = (int)(Math.random()*(10-0))+0;
                   
                  String digito1 = (i == 3) ? "E" : Integer.toString(i);
                  String digito2 = (j == 3) ? "E" : Integer.toString(j);
                  String digito3 = (k == 3) ? "E" : Integer.toString(k);
                  System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                
        }          
            }
                }
                       
    }
             
}
    

