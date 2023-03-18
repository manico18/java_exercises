
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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y 
        // lo muestre por pantalla.
        
        Scanner sca = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre:");
        nombre = sca.next();
        
        System.out.println("El nombre del usuario es: " + nombre);
        
    }
    
}
