
package ejercicioex06poo;

import Entidad.Rectangulo;

/**
 *
 * @author MATIAS
 */
public class EjercicioEX06POO {

    public static void main(String[] args) {
        /*
        Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un 
        método "calcular_area" que calcule y devuelva el área del rectángulo. 
        Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de
        4 y 6 y imprime el área del rectángulo.
        */
        
        Rectangulo rect1 = new Rectangulo(4, 6);
        
        System.out.println("El area del rectangulo es: " + rect1.calArea(0));
    }

}
