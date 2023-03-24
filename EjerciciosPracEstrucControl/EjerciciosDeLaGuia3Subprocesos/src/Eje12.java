
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
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
        // el usuario, validando que el primer número múltiplo del segundo e imprima 
        // si el primer número es múltiplo del segundo, sino informe que no lo son.

        Scanner sca = new Scanner(System.in);

        int num, num1;

        System.out.println("Ingrese dos numeros");
        num = sca.nextInt();
        num1 = sca.nextInt();

        System.out.println("Los numeros son mulriplos " + esMultiplo(num,num1));
        }

    public static boolean esMultiplo(int num, int num1) {
        boolean ban;
        ban = num % num1 == 0;
        return ban;
    }
}
