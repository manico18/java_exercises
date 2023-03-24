
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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        // este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
        // deben llegar con un formato fijo: tienen que ser de un máximo de 5 
        // caracteres de largo, el primer carácter tiene que ser X y el último tiene 
        // que ser una O.
        // Las secuencias leídas que respeten el formato se consideran correctas, 
        // la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
        // y toda secuencia distinta de FDE, que no respete el formato se considera 
        // incorrecta.
        // Al finalizar el proceso, se imprime un informe indicando la cantidad de 
        // lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
        // deberá investigar cómo se utilizan las siguientes funciones de Java 
        // Substring(), Length(), equals().
        
        Scanner sca = new Scanner(System.in);
        
        String cad;
        int tcad;
        int i = 0,j = 0;
        
        do {
            System.out.print("Ingrese una cadena de 5 caracteres:");
            cad = sca.nextLine();
            tcad = cad.length();
            
            
            if(tcad<=5){
                
            }else{
                System.out.println("la cadena ingresada tiene mas de 5 caracteres, ingresela nuevamente");
            }
             
            if (!cad.substring(0,1).toUpperCase().equals("X") || !cad.substring(4,5).toUpperCase().equals("O") || tcad!=5){
                i++;
            }else{
                j++;
            }    
    
        } while (!cad.equalsIgnoreCase("&&&&&"));
        
        System.out.println("La cantidad de cadenas ingresadas correctas es: " + (j));
        System.out.println("La cantidad de cadenas ingresadas incorrectas es: " + (i-1));
    }
        
}
    

