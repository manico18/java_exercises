
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        // Crear un programa que dibuje una escalera de números, donde cada línea 
        // de números comience en uno y termine en el número de la línea. 
        // Solicitar la altura de la escalera al usuario al comenzar. 
        // Ejemplo: si se ingresa el número 3:
        
        // 1
        // 12
        // 123
        
        Scanner sca = new Scanner(System.in);

        int num, i;
        System.out.print("Ingrese un numero:");
        num = sca.nextInt();

        for (i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }

    }

}

