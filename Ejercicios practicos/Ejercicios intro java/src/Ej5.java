
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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre 
        // por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        // Nota: investigar la función Math.sqrt().
        
        Scanner sca = new Scanner (System.in);
        
        int num;
        
        
        System.out.println("Ingrese un numero:");
        num = sca.nextInt();
        
        System.out.println("El doble del numero ingresado es: " + num*2);
        System.out.println("El triple del numero ingresado es: " + num*3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
    }
    
}
