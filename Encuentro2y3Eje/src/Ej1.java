
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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida dos números enteros por teclado y calcule 
        //la suma de los dos. El programa deberá después mostrar el resultado de la suma.
        
        Scanner sca = new Scanner(System.in);
        
        int num,num1,suma;
        
        System.out.println("Ingrese el primer numero:");
        num = sca.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        num1 = sca.nextInt();
        
        suma=num+num1;
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
