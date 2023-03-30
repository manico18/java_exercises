
import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres 
        y, a medida que el usuario las va ingresando, construya una “sopa de 
        letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán 
        todas en orden horizontal en una fila que será seleccionada de manera 
        aleatoria. Una vez concluida la ubicación de las palabras, rellene los 
        espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
        imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java substring(), Length() y Math.random().
        */
        
        Scanner sca = new Scanner(System.in);
        int j=0,tamPal;
        String palabra,matriz[][] = new String[11][11];
        
        do {
            palabra = sca.nextLine();
            tamPal = palabra.length();
            j++;
            if(tamPal >=3 && tamPal <=5){
                
                for (int i = 0; i < 10; i++) {
                    for (int k = 0; k < 10; k++) {
                       matriz[i][k] = palabra.substring(i,k);
                       
                    }
                }
            }
        } while (j==5);
        
        
        
    }
    
}
