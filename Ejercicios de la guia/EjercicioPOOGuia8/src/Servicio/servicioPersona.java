
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */

public class servicioPersona {
    
    private Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public  Persona crearPersona(){

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre= sca.next();
        System.out.println("===============================");
        System.out.print("Ingrese la edad de la persona: ");
        int edad = sca.nextInt();
        System.out.println("===============================");
        System.out.print("Ingrese la direccion de la persona: ");
        String direccion = sca.next();
        
        return new Persona(nombre,edad,direccion);
        
        
    }

    
        
    
    
    }

