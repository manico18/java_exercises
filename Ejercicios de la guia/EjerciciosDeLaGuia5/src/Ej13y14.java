
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Ej13y14 {

    public static void main(String[] args) {
        
        /*
        13)-Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
        de equipo y define su tipo de dato de tal manera que te permita alojar sus 
        nombres más adelante.
        14)-Utilizando un Bucle for, aloja en el vector Equipo, los nombres de 
        tus compañeros de equipo.
        */
        Scanner sca = new Scanner(System.in);
        String nombre;
        
        String equipo [] = new String [6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingresar los nombres de sus compañeros/as de equipo:");
            nombre = sca.nextLine();
            equipo[i] = nombre;    
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println("[" +equipo[i]+ "]"); 
            
        }
    }
}  
