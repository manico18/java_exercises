
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class fechaService {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        
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
        System.out.println("==============================");
        return fecha;
    }
    
    public Date fechaActual(){
        
        Date hoy = new Date();
        return hoy;
    }
    
    public void diferencia(Date hoy, Date fecha){
        
        int edad = (hoy.getYear() - fecha.getYear());
        
        System.out.println("La edad del usuario es: " + edad + " años.");
        
    }
    
}
