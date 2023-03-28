
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
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que procese una secuencia de caracteres ingresada 
        // por teclado y terminada en punto, y luego codifique la palabra o frase 
        // ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
        // que se indica en la tabla y el resto de los caracteres (incluyendo a 
        // las vocales acentuadas) se mantienen sin cambios.
        
        Scanner sca = new Scanner(System.in);
        
        String fra;
        System.out.print("Ingrese un frase: ");
        fra = sca.nextLine();
        
         
        
         System.out.println("La frase modificada es: " + cambCar (fra));
    }
    
    public static String cambCar(String fra){
       
       String frase = "";
        for (int i = 0; i < fra.length(); i++) {
             String letra = fra.substring(i, i + 1);
          
                switch(letra){                   
                    case "a":
                        frase += "@";
                        break;
                    case "e":
                        frase += "#";
                        break;
                    case "i":
                        frase += "$";
                        break;
                    case "o":
                        frase += "%";
                        break;
                    case "u":
                        frase += "&";
                        break;
                    default:
                         frase += letra;       
                }
            }
            
        
        
      return frase;      
          
        
    }
}
