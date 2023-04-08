
import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera 
        // letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera 
        // de imprimir un mensaje por pantalla que diga “CORRECTO�?, en caso contrario, 
        // se debera imprimir “INCORRECTO�?. 
        // Nota: investigar la funcion Substring y equals() de Java.
        
        Scanner sca = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese una frase");
        frase = sca.nextLine();
        frase = frase.substring(0, 1);
        
        
        
        if (frase.equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
