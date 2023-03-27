
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
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
        // se trata de una vocal. Caso contrario mostrar un mensaje. 
        // Nota: investigar la función equals() de la clase String.
        
        Scanner sca = new Scanner(System.in);
        
        String le;
        
        System.out.print("Ingrese un letra:");
        le = sca.next();
        
        if (le.equalsIgnoreCase("a") || le.equalsIgnoreCase("e") || le.equalsIgnoreCase("i") || le.equalsIgnoreCase("o") || le.equalsIgnoreCase("u")){
        
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
