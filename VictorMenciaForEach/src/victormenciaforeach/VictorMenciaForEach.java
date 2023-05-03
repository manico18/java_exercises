
package victormenciaforeach;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class VictorMenciaForEach {

    public static void main(String[] args) {
        /*
        
        */
        
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] nombresConA = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un nombre");
            String nombreUsuario = leer.nextLine();
            nombres[i] = nombreUsuario;
        }
        
        int contador = 0;
        for (String elemento : nombres) {
            System.out.println(elemento.length());
            if (elemento.startsWith("a") || elemento.startsWith("A")) {
                nombresConA[contador] = elemento;
                contador++;
            }
        }

        for (String elemento : nombresConA) {
            System.out.println(elemento);
        }   
        
    }
        

    }


