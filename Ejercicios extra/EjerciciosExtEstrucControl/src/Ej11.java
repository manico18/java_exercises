
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        // Escribir un programa que lea un número entero y devuelva el número de 
        // dígitos que componen ese número. Por ejemplo, si introducimos el número 
        // 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
        // matemáticamente utilizando el operador de división. Nota: recordar que 
        // las variables de tipo entero truncan los números o resultados.
        
        Scanner sca = new Scanner(System.in);

        long num, i;
        System.out.print("Ingrese un numero: ");
        num = sca.nextLong();

        i = 0;

        while (num != 0) {
            i++;
            num = Math.abs(num / 10);
        }

        System.out.println("El numero de digitos del numero ingresado es: " + i);
    }

}
