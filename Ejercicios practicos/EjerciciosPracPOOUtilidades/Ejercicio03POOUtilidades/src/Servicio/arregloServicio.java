
package Servicio;

import java.util.Arrays;

/**
 *
 * @author MATIAS
 */
public class arregloServicio {

    public void inicializarA (double arrayA[]){
        
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.random()*100;
        }
        System.out.println("============MOSTRAR==============");
    }
  
    public void mostrarA (double arrayA[]){
        
        for (int i = 0; i < arrayA.length; i++) {    
           System.out.println("["+arrayA[i]+"]");
            System.out.println("=============================================");
        }
        System.out.println("============ORDENAR=============="); 
    }
   
    public void ordenar (double arrayA[]){
        
        Arrays.sort(arrayA);
        
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("["+arrayA[i]+"]");
            System.out.println("=============================================");
        }
        System.out.println("============LLENAR ARRAY B==============");
    }
    
    public void inicializarB (double arrayB[], double arrayA[]){
        
        for (int i = 0; i < 10; i++) {
            
            arrayB[i] = arrayA[i]; 
        }
        
        for (int i = 0; i < arrayB.length; i++) {
            Arrays.fill(arrayB, 10, 20,0.5);
        }
        
        for (int i = 0; i < arrayB.length; i++) {
            
            System.out.println("["+arrayB[i]+"]");
        }
   
    }
    
    public void mostrarAyB (double arrayA[], double arrayB[]){
        System.out.println("=============ARRAY-A==============");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("["+arrayA[i]+"]");
        }
        System.out.println("=============ARRAY-B==============");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("["+arrayB[i]+"]");
        }
    }
}
