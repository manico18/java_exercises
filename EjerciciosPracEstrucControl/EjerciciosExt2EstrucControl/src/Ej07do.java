
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
public class Ej07do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que calcule y visualice el valor máximo, el valor 
        // mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
        // principio del programa y los números serán introducidos por el usuario. 
        // Realice dos versiones del programa, una usando el bucle “while” y otra 
        // con el bucle “do - while”.
        
        Scanner sca = new Scanner (System.in);
       
        int num,nMax,nMin,i,num1,suma;
        
        i=1;
        suma=0;
        nMax=0;
        nMin=1000000000;
        
        System.out.print("Ingrese la cantidad de numeros que desea ingresar:");
        num = sca.nextInt();
        
        do{
            
            System.out.print("Ingrese un numero: ");
            num1 = sca.nextInt();
            i++;
            suma=suma+num1;
            
            if(num1>nMax){
                nMax = num1;   
            }
            
            if(num1<nMin){
                nMin = num1;
            }
            
        }while(num>0 && i<=num);
                
        System.out.println("El numero mayor ingresado es: " + nMax);
        System.out.println("El numero menor ingresado es: " + nMin);
        System.out.println("El promedio de los numeros ingresados es: " + suma/(i-1)); 
            
        }
        
        
        
    }
    

