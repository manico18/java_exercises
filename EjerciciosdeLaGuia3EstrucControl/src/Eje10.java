
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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
        // imprima el número ingresado seguido de tantos asteriscos como indique su valor.
        // Por ejemplo:
        // 5 *****

        Scanner sca = new Scanner(System.in);
        
        int i,num,j;
        j=1;
        
        do{
        System.out.println("Ingrese 4 numeros");
        num = sca.nextInt();
        j++;
        System.out.println("=======================");
        
        if (num<1 || num>20){
                System.out.println("El numero ingresado esta fuera del rango");
                j--;
        continue;}
        
        System.out.print(num + (" "));
            
        for (i = 1; i <= num; i++) {
            System.out.print("*");
            
        continue;}
        
            System.out.println("");
            
        } while (j<=4);       
    }   
    }
    

