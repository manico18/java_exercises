
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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simular la división usando solamente restas. Dados dos números enteros 
        // mayores que uno, realizar un algoritmo que calcule el cociente y el 
        // residuo usando sólo restas. Método: Restar el dividendo del divisor 
        // hasta obtener un resultado menor que el divisor, este resultado es el 
        // residuo, y el número de restas realizadas es el cociente.
        
        Scanner sca = new Scanner(System.in);
        
        int num,num1,i;
        System.out.println("Ingrese dos numeros enteros: ");
        num = sca.nextInt();
        System.out.println("=============");
        num1 = sca.nextInt();
        
        i=0;
        
        while(num>num1){
            num1 = num1;
           num=num-num1; 
           i=i+1;
        }
        System.out.println("El cosiente es: " +i);
        System.out.println("El residuo es: " + num1);
    }
    
}
