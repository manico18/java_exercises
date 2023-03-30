
import java.util.Scanner;


public class Ej01 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un 
        vector de tamaño N, con los valores ingresados por el usuario.
        */
        
        Scanner sca = new Scanner(System.in);
        
        int suma = 0,vector[] = new int[4];
        
        //Llena vector por teclado. 
        for (int i = 0; i < 3; i++) {
            vector[i]= sca.nextInt();
        }
        
        //Suma del vector.
        for (int i = 0; i < 3; i++) {
            suma += vector[i];
        }
        
        //Mostrar vector.
        for (int i = 0; i < 3; i++) {
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("");
        System.out.println("===================");
        System.out.println("La suma del vector es: " + suma);
        
        
    }
    
}
