
import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) {
        // Simular la división usando solamente restas. Dados dos números enteros 
        // mayores que uno, realizar un algoritmo que calcule el cociente y el 
        // residuo usando sólo restas. Método: Restar el dividendo del divisor 
        // hasta obtener un resultado menor que el divisor, este resultado es el 
        // residuo, y el número de restas realizadas es el cociente.
        
        Scanner sca = new Scanner(System.in);

        int num, num1, i;
        System.out.println("Ingrese dos numeros enteros: ");
        num = sca.nextInt();
        System.out.println("=============");
        num1 = sca.nextInt();

        i = 0;

        while (num > num1) {
            num1 = num1;
            num = num - num1;
            i = i + 1;
        }
        System.out.println("El cosiente es: " + i);
        System.out.println("El residuo es: " + num1);
    }

}
