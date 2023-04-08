
package ejercicio02poo;


import entidad.Circunferencia;
import java.util.Scanner;


/**
 *
 * @author MATIAS
 */
public class Ejercicio02POO {

    public static void main(String[] args) {
        /*
        Declarar una clase llamada Circunferencia que tenga como atributo privado 
        el radio de tipo real. A continuación, se deben crear los siguientes métodos:
        
        Método constructor que inicialice el radio pasado como parámetro.
        
        Métodos get y set para el atributo radio de la clase Circunferencia.
        
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en 
        el atributo del objeto.
        
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
        */
        
        Scanner sca = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del circulo:");
        Circunferencia cC = new Circunferencia(sca.nextDouble());
     
        System.out.println("Para un circulo de radio "+cC.getRadio()+" su area es : "
                           + cC.calArea(0)+" su perimetro es: "+cC.calPeri(0));
                
    }

}
