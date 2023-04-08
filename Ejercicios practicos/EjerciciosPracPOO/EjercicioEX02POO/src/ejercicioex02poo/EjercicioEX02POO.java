
package ejercicioex02poo;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class EjercicioEX02POO {

    public static void main(String[] args) {
        /*
        Definir una clase llamada Puntos que contendrá las coordenadas de dos 
        puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
        Generar un objeto puntos usando un método crearPuntos() que le pide al 
        usuario los dos números y los ingresa en los atributos del objeto. Después,
        a través de otro método calcular y devolver la distancia que existe entre 
        los dos puntos que existen en la clase Puntos.
        d(P1,P2)=√(x2−x1)2+(y2−y1)2
        */           
        
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los valores de las x e y: ");
        Puntos posi = new Puntos(sca.nextInt(),sca.nextInt(),sca.nextInt(),sca.nextInt());
        
        System.out.println("La distancia entre ambos puntos es: "+posi.distancia(0));
    }

}
