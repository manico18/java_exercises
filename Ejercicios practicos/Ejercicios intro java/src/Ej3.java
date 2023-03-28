
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATIAS
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas 
        // y después toda en minúsculas. 
        // Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        Scanner sca = new Scanner(System.in);
        
        String frase;
        
        System.out.println("ingrese una frase:");
        frase = sca.nextLine();
         System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
         System.out.println("La frase en minuscula es: " + frase.toLowerCase());
         
        
        
    }
    
}
