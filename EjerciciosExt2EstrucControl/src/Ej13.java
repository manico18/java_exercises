
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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dibuje una escalera de números, donde cada línea 
        // de números comience en uno y termine en el número de la línea. 
        // Solicitar la altura de la escalera al usuario al comenzar. 
        // Ejemplo: si se ingresa el número 3:
        
        // 1
        // 12
        // 123
        
        Scanner sca =   new Scanner(System.in);
        
        int num,i;
        System.out.print("Ingrese un numero:");
        num=sca.nextInt();
        
        for ( i = 0; i < num; i++)
        {
            for (int j = 0; j <= i; j++)
                {
                    System.out.print((j+1));
                }
            System.out.println();
        }
                
            
                            
                
            
  
       
        }

    }
    

