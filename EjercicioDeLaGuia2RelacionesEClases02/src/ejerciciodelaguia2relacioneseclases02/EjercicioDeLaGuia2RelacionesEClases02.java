
package ejerciciodelaguia2relacioneseclases02;

import EntidadE.Equipo;
import EntidadJ.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia2RelacionesEClases02 {

    public static void main(String[] args) {
        /*
        Realiza un programa en donde exista una clase Jugador que contenga nombre,
        apellido, posición y número. Luego otra clase Equipo que contenga una 
        colección de jugadores. Una vez hecho esto, desde el main recorreremos 
        el equipo mostrando la información de cada jugador.
        */
        
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        Jugador j = new Jugador();
        Equipo e = new Equipo();
        ArrayList <Jugador> jugadores = new ArrayList();

            System.out.print("Ingrese el nombre del jugador: ");
            j.setNombre(sca.next());
            System.out.println("=================================================");
            System.out.print("Ingrese el apellido del jugador: ");
            j.setApellido(sca.next());
            System.out.println("=================================================");
            System.out.println("Ingrese la posicion del jugador: ");
            j.setPosicion(sca.nextInt());
            System.out.println("=================================================");
            System.out.print("Ingrese el numero del jugador: ");
            j.setNumero(sca.nextInt());
            System.out.println("=================================================");

            jugadores.add(j);

            e.setJugadores(jugadores);
            
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore); 
        }
   
    }

}
