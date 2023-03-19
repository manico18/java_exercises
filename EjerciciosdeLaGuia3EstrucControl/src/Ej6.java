
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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementar un programa que le pida dos números enteros al usuario y 
        // determine si ambos o alguno de ellos es mayor a 25.
        
        Scanner sca = new Scanner(System.in);
        
        int num,num1;
        
        System.out.println("Ingrese dos numeros enteros: ");
        num = sca.nextInt();
        num1 = sca.nextInt();
        
        if (num>25 && num1>25){
        System.out.println("Ambos numeros son mayores a 25");
        
       }else if (num>25 || num1>25){
            System.out.println("Uno de los numeros es mayor a 25");
       }
    }
    
}
