
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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñe una función que pida el nombre y la edad de N personas e imprima 
        // los datos de las personas ingresadas por teclado e indique si son mayores 
        // o menores de edad. Después de cada persona, el programa debe preguntarle 
        // al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
        // ingrese la palabra “No”.
        
        Scanner sca = new Scanner(System.in);
        
        String nombre,op;
        int edad;
        
        do{
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = sca.next();
        System.out.print("Ingrese la edad de la persona: ");
        edad = sca.nextByte();
            System.out.println(menorMayor(edad));
        System.out.println("===============================");
        System.out.print("¿Desea continuar ingresando datos?: S/N ");
        op = sca.next();
        }while(op.equalsIgnoreCase("S"));
    }
    
    public static String menorMayor(int edad){
        String mm;
        if(edad>=18){
            mm="MAYOR";
        }else{
            mm="MENOR";
        }
        return mm;
    }
}
