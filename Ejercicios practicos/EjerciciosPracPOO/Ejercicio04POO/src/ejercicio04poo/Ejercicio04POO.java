
package ejercicio04poo;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Ejercicio04POO {

    public static void main(String[] args) {
        /*
        Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
        privado base y un atributo privado altura. La clase incluirá un método 
        para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
        También incluirá un método para calcular la superficie del rectángulo y 
        un método para calcular el perímetro del rectángulo. Por último, tendremos 
        un método que dibujará el rectángulo mediante asteriscos usando la base y 
        la altura. Se deberán además definir los métodos getters, setters y 
        constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.
        */
        Scanner sca = new Scanner(System.in).useDelimiter("\n");

        Rectangulo sPD = new Rectangulo(0, 0);

        System.out.println("La superficie del rectangulo es: " + sPD.supRectangulo(0)
                       + " el perimetro del rectangulo es: " + sPD.periRectangulo(0));

        System.out.println(sPD.dibuRectangulo(""));

    }

}
