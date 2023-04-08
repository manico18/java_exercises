
import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
        // se trata de una vocal. Caso contrario mostrar un mensaje. 
        // Nota: investigar la función equals() de la clase String.
        
        Scanner sca = new Scanner(System.in);
        
        String le;
        
        System.out.print("Ingrese un letra:");
        le = sca.next();
        
        if (le.equalsIgnoreCase("a") || le.equalsIgnoreCase("e") || le.equalsIgnoreCase("i") || le.equalsIgnoreCase("o") || le.equalsIgnoreCase("u")){
        
            System.out.println("La letra ingresada es una vocal, " + "ingreso la letra "+le);
        }else{
            System.out.println("La letra ingresada no es una vocal, " + "ingreso la letra "+le);
        }
    }
    
}
