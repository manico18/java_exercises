
package ejerciciospoo;

import Entidad.Persona;

public class EjerciciosPOO {

    public static void main(String[] args) {
        
         //Establecimiento y nacimiento de constructor
        Persona  pp = new Persona("Matias",34,1.72);
        
       
        //funcion set se cambian los atributos a imprimir
        pp.setNombre("Jacinto");
        pp.setEdad(36);
        pp.setEstatura(1.85);
        // y se utilisa el get para tomar los atributos cambiados con el set.
        System.out.println( pp.getEdad() + " años "+ pp.getEstatura()+" metros "+ pp.getNombre());
    }

   
    
}
