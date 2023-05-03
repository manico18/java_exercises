
package ejercicioex01poo;

import Entidad.Cancion;

/**
 *
 * @author MATIAS
 */
public class EjercicioEX01POO {

    public static void main(String[] args) {
        /*
        Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
        Se deberá definir además dos constructores: uno vacío que inicializa el 
        título y el autor a cadenas vacías y otro que reciba como parámetros el 
        título y el autor de la canción. Se deberán además definir los métodos 
        getters y setters correspondientes.
        */
        
        Cancion tA = new Cancion("Se vos", "Ricardo Ioro");
        
        System.out.println("El titulo de la cancion es "+tA.getTitulo()+" del autor "
                +tA.getAutor());
        
        

    }

}
