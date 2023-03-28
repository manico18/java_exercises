

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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera 
        // letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera 
        // de imprimir un mensaje por pantalla que diga “CORRECTO�?, en caso contrario, 
        // se debera imprimir “INCORRECTO�?. 
        // Nota: investigar la funcion Substring y equals() de Java.
        
        Scanner sca = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese una frase");
        frase = sca.nextLine();
        frase = frase.substring(0, 1);
        
        
        
        if (frase.equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
