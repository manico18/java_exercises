
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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa para que el usuario adivine el resultado de una 
        // multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
        // El programa debe indicar al usuario si su respuesta es o no correcta. 
        // En caso que la respuesta sea incorrecta se debe permitir al usuario 
        // ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
        // como utilizar la función Math.random() de Java.
        
        Scanner sca=new Scanner(System.in);
        
        double num,num1,num2,num3;
        
        num = Math.floor(Math.random()*(11-0))+0;
        num1 = Math.floor(Math.random()*(11-0))+0;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2=num*num1);
        
        do{
            System.out.print("Ingrese un numero para adivinar la multiplicacion: ");
            num3=sca.nextDouble();
            
            if(num3==num2){
                System.out.println("CORRECTO");
                break;
            }else{
                System.out.println("Incorrecto ingrese un numero nuevamente");
            
        }
        }while(num3!=num2);
    }
    
}
