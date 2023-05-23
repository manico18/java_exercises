
package ejercicioprac01relacioneseclases;

import EntidadPe.Persona;
import EntidadPerro.Perro;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class EjercicioPrac01RelacionesEClases {

    public static void main(String[] args) {
        /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos 
        a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, 
        edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad,
        documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos
        a tener que pensar la lógica necesaria para asignarle a cada Persona un 
        Perro y por ultimo, mostrar desde la clase Persona, la información del 
        Perro y de la Persona.
        */
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        
        Perro pE1 = new Perro();
        System.out.print("Ingrese el nombre del perro: ");
        pE1.setNombre(sca.next());
        System.out.println("=================================================");
        System.out.print("Ingrese la raza del perro: ");
        pE1.setRaza(sca.next());
        System.out.println("=================================================");
        System.out.print("Ingrese la edad del perro: ");
        pE1.setEdad(sca.nextInt());
        System.out.println("=================================================");
        System.out.print("Ingrese el tamaño del perro: ");
        pE1.setTamanio(sca.next());
        System.out.println("=================================================");
        
        
        Perro pE2 = new Perro();
        System.out.print("Ingrese el nombre del perro: ");
        pE2.setNombre(sca.next());
        System.out.println("=================================================");
        System.out.print("Ingrese la raza del perro: ");
        pE2.setRaza(sca.next());
        System.out.println("=================================================");
        System.out.print("Ingrese la edad del perro: ");
        pE2.setEdad(sca.nextInt());
        System.out.println("=================================================");
        System.out.print("Ingrese el tamaño del perro: ");
        pE2.setTamanio(sca.next());
        System.out.println("=================================================");
        
        
        System.out.println("Ingrese en este orden, su nombre, apellido, edad y dni:");
        Persona p1 = new Persona(sca.next(), sca.next(), sca.nextInt(), sca.nextInt(), pE1);
        System.out.println("===============================================================");
        System.out.println(p1);
        
        
        System.out.println("Ingrese en este orden, su nombre, apellido, edad y dni:");
        Persona p2 = new Persona(sca.next(), sca.next(), sca.nextInt(), sca.nextInt(), pE2);
        System.out.println("===============================================================");
        System.out.println(p2);
        

    }

}
