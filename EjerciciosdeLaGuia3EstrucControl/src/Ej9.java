
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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que lea 20 números. Si el número leído es igual a 
        // cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
        // El programa deberá calcular y mostrar el resultado de la suma de los números 
        // leídos, pero si el número es negativo no debe sumarse. 
        // Nota: recordar el uso de la sentencia break.
        
        Scanner sca = new Scanner(System.in);
        
        int num,suma;
         
        suma=0;
        
        do {
            System.out.println("Ingrese 20 veces cualquier numero numero: ");
            num = sca.nextInt();
            
            if (num<0){
                System.out.println("El numero ingresado es negativo no se tendra en cuenta en la suma");   
            continue;}
            
            
            suma=suma+num;
            continue;
            
            
            
        } while (num != 0);
        System.out.println("Ah ingresado el numero 0");
        System.out.println("la suma de los numeros ingresados es: " + suma);
       
        
            }  
    }
     
    

