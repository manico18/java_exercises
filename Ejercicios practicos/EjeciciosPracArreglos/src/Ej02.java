
import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
        y le pida al usuario un número a buscar en el vector. El programa mostrará 
        dónde se encuentra el numero y si se encuentra repetido.
        */
        
        Scanner sca = new Scanner(System.in);
        
        int array[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            array [i] = (int) (Math.random() * 10); 
            System.out.println("["+array[i]+"]");
        }
        
        System.out.print("Ingrese un numero a buscar en el vector: ");
        int num = sca.nextInt();
        
        for (int i = 0; i < 10 ; i++) {
            
            if(num == array[i]){
            System.out.println("["+i+"]");
            
            }       
    }
        
      
        }
    }

