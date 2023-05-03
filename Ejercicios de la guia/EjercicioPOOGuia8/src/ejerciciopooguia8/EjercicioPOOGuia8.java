
package ejerciciopooguia8;

import Entidad.Persona;
import Servicio.servicioPersona;

/**
 *
 * @author MATIAS
 */
public class EjercicioPOOGuia8 {

    public static void main(String[] args) {
        /*
        Crea un método void que reciba un objeto tipo persona como parámetro y 
        utilice el get para mostrar sus atributos. Llama ese método desde el main.
        */
        
        servicioPersona p = new servicioPersona();
        
        
        Persona p1 = p.crearPersona();
        
        System.out.println("El nombre de la persona es: "+p1.getNombre()+
                ", su direccion es: "+p1.getDireccion()+" y tiene "+p1.getEdad()
                +" años.");

    }

}
