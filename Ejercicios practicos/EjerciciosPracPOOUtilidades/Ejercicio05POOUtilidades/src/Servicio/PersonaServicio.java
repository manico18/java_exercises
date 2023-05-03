
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class PersonaServicio {

    Persona p = new Persona();
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.print("Ingrese su nombre: ");
        p.setNombre(sca.next());
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.print("Ingrese el dia de su nacimiento:");
        int dia = sca.nextInt();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.print("Ingrese el mes de su nacimiento:");
        int mes = sca.nextInt();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.print("Ingrese el año de su nacimiento:");
        int anio = sca.nextInt();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        Date fecha = new Date (anio-1900,mes-1,dia);
        p.setFecha(fecha);
        return p;
     
    }
    
    public int calcularEdad (Persona p){
      
        int edad;
        Date hoy = new Date ();
        
         return edad = hoy.getYear() - p.getFecha().getYear();
        
        
        
    }
    
    public boolean menorQue(Persona p, int edadC){
        System.out.println("♠" + calcularEdad(p));
        if(calcularEdad(p) < edadC){
            System.out.println("La edad ingresada es mayor a la edad del usuario.");
        }else{
            System.out.println("La edad ingresada es menor a la edad del usuario.");
        }
        
        return  calcularEdad(p) < edadC;
    }
        
    public void mostrarPersona (Persona p){
        
        System.out.println("El usuario " + p.getNombre() + " nacio el dia " + p.getFecha()
        + " y tiene " + calcularEdad(p) + " años.");
        
    }
}
