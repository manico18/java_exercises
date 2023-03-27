
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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que le pida dos números al usuario y este pueda 
        // elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        // tener una función para cada operación matemática y deben devolver sus 
        // resultados para imprimirlos en el main. 
        
        Scanner sca = new Scanner(System.in);
        
        int num,num1,op;
        String op1;
        boolean ban = true;
        
        System.out.println("Ingrese dos numeros");
            num = sca.nextInt();
            num1 = sca.nextInt();
          
        do{
           
            System.out.println("==========================");
            System.out.println("Ingrese un opcion del menu");
            System.out.println("==========================");
            System.out.println("MENU:\n1.suma\n2.resta\n3.divicion\n4.multipliccion\n5.salir");
            op = sca.nextInt();
            System.out.println("==========================");
            
            switch (op){
                case (1):
                    
                    System.out.println("La suma de los numeros es: " + sumar( num, num1));
                    break;
                    
                case (2):                  
                    System.out.println("La resta de los numeros es: " + restar(num,num1));
                    break;
                    
                case (3):                   
                    System.out.println("La divicion de los numeros es: " + divi(num,num1));
                    break;
                    
                case (4):                    
                    System.out.println("La multiplicacion de los numeros es: " + multi(num,num1));
                    break;
                    
                case (5):
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    op1 = sca.next();
                    
                    if (op1.equalsIgnoreCase("s")){
                        ban = false;
                        System.out.println("Ah elegido salir del menu. Hasta pronto.");
                    break;
                    }else if (op1.equalsIgnoreCase("n")){
                        System.out.println("Ah elegido volver al menu.");  
                    }
                    break;
                    
                   default:
                        System.out.println("La opcion ingresada no es corecta");}
            
                   continue;
                   
            }while(ban);
        
  
}
    
 public static int sumar(int num, int num1){
     int suma;
     return suma = num + num1;
 }
  
 public static int restar(int num, int num1){
     int resta;
     return resta = num - num1;
 }
 
 public static double divi(double num, double num1){
     double divir;
     return divir = num / num1;
 }
 
 public static int multi(int num, int num1){
     int multir;
     return multir = num * num1;
 }
      
  }
  
  
