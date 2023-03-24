
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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que pida una frase y si esa frase es igual a 
        // “eureka” el programa pondrá un mensaje de Correcto, sino mostrará
        // un mensaje de Incorrecto. 
        // Nota: investigar la función equals() en Java.
        
        Scanner sca = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = sca.next();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");}
        }
        
         
        }
           
        
    
    

