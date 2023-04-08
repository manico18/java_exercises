
import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {
        // Escriba un programa que lea números enteros. Si el número es múltiplo 
        // de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
        // la cantidad de números pares y la cantidad de números impares. Al igual 
        // que en el ejercicio anterior los números negativos no deben sumarse. 
        // Nota: recordar el uso de la sentencia break.
        
        Scanner sca = new Scanner(System.in);

        int num, i, j, k;
        i = 0;
        j = 0;
        k = 0;

        do {

            System.out.print("Ingrese un numero: ");
            num = sca.nextInt();
            i++;

            if (num < 0) {
                System.out.println("El numero ingresado es negativo, no se contavilizara como ingreso");
                i--;
            } else if (num % 5 == 0) {
                i--;
                break;
            }

            if (num % 2 == 0 && num >= 0) {
                j++;
            } else if (num % 2 != 0 && num >= 0 && num % 5 != 0) {
                k++;
            }

        } while (num % 5 != 0);

        System.out.println("Total de numeros ingresados: " + i);
        System.out.println("Total de numeros pares ingresados: " + j);
        System.out.println("Total de numeros ingresados impares: " + k);

    }

}
