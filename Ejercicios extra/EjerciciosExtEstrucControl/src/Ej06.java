
import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas que 
        // se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
        
        Scanner sca = new Scanner(System.in);

        double esta, suma, suma1;
        int i, j;
        i = 0;
        j = 0;
        suma = 0;
        suma1 = 0;

        do {
            System.out.print("Ingrese una estatura: ");
            esta = sca.nextDouble();

            if (esta < 1.60) {
                i++;
                suma = suma + esta;
            } else {
                j++;
                suma1 = suma1 + esta;
            }

        } while (esta != 0);

        System.out.println("El promedio de estaturas menores a 1,60m es: " + suma / (i - 1));
        System.out.println("El promedio de estaturas en general es: " + suma1 / j);

    }

}
