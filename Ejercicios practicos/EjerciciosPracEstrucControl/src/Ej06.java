
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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que pida dos números enteros positivos por teclado 
        // y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
        // opción y el programa deberá mostrar el resultado por pantalla y luego 
        // volver al menú. El programa deberá ejecutarse hasta que se elija la 
        // opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
        // en vez de salir del programa directamente, se debe mostrar el siguiente 
        // mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        // Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
        // contrario se vuelve a mostrar el menú. MENU 1.SUMAR-2.RESTAR-3.DIVID-4.MULTI-5.SALIR
        
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
                    System.out.println("La suma de los numeros es: " + (num + num1));
                    break;
                    
                case (2):                  
                    System.out.println("La resta de los numeros es: " + (num - num1));
                    break;
                    
                case (3):                   
                    System.out.println("La divicion de los numeros es: " + (num / num1));
                    break;
                    
                case (4):                    
                    System.out.println("La multiplicacion de los numeros es: " + (num * num1));
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
    
}
