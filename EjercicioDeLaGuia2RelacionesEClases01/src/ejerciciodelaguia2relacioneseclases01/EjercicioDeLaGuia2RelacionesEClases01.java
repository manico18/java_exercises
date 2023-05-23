
package ejerciciodelaguia2relacioneseclases01;


import EntidadD.Dni;
import EntidadP.Persona;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia2RelacionesEClases01 {

    public static void main(String[] args) {
        /*
        Realiza un programa en donde una clase Persona tenga como atributo nombre,
        apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la
        serie (carácter) y número. Prueba acceder luego a los atributos del dni 
        de la persona creando objetos y jugando desde el main.
        */
        
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona ();
        Dni dN = new Dni();
        
        dN.setNumeroDni(34146244);
        dN.setSerie('A');
        System.out.print("Ingrese el nombre de la persona: ");
        p.setNombre(sca.next());
        System.out.println("=================================================");
        System.out.print("Ingrese el apellido de la persona: ");
        p.setApellido(sca.next());
        System.out.println("=================================================");
        p.setDni(dN);
       
        System.out.println(p.getDni());
       
        
        
      
        
        

    }

}
