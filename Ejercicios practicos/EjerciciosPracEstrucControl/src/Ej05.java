
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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor limite positivo, y 
        // a continuacion solicite numeros al usuario hasta que la suma de los 
        // numeros introducidos supere el limite inicial.
        
        Scanner sca = new Scanner(System.in);
        
        int num,num1,suma;
        
        System.out.println("Ingrese un nunmero limite inicial");
        num = sca.nextInt();
        suma=0;
        
        do{
            System.out.println("Ingrese numeros");
            num1 = sca.nextInt();
            suma = suma+num1;
            continue;
        }while(suma<=num);
        
        System.out.println("La suma de los numeros ingresados es: " + suma +" \nEl numero limite es: " + num);
       
    }
    
}
