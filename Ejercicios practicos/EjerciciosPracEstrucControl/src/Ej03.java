
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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que solo permita introducir solo frases o palabras 
        // de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
        // deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        // en caso contrario, se deberá imprimir “INCORRECTO”. 
        // Nota: investigar la funcion Lenght() en Java.
        
        Scanner sca = new Scanner(System.in);
        
        String frase;
        int car;
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        frase = sca.nextLine();
        car = frase.length();
        System.out.println("Cantidad de caracteres de la frase " + car);
        
        if (car<=8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
   
    }    
        
    }
    

