package ejercicio01poo;

import entidad.Libro;
import java.util.Scanner;

public class Ejercicio01POO {

    public static void main(String[] args) {
        /*
        Crear una clase llamada Libro que contenga los siguientes atributos: 
        ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
        atributos pasados por parámetro y un constructor vacío. Crear un método 
        para cargar un libro pidiendo los datos al usuario y luego informar 
        mediante otro método el número de ISBN, el título, el autor del libro y 
        el número de páginas.
         */

        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ICBN, titulo, autor y numero de pagina del libro:");
        Libro datos = new Libro(sca.nextInt(), sca.next(), sca.next(), sca.nextInt());
      
        System.out.println(datos);

    }

}
