
package ejerciciodelaguia1colecciones05;

import Entidad.Libreria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia1Colecciones05 {

    public static void main(String[] args) {
        /*
        ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno 
        con un bucle.
        */
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        
        //se crea una arrayList(libros)del objeto libreria.
        ArrayList <Libreria> libros = new ArrayList(); 
        String resp = "";
        
        /*
        En el bucle do se instancia el objeto libreria con nombre libro para guardar 
        los datos ingresados por el usario en los atributos del objeto.
        */
        
        do {
            
            Libreria libro = new Libreria();
            System.out.print("Ingrese el numero del libro: ");
            libro.setNumeroDelLibro(sca.nextInt());
            System.out.println("===========================");
            System.out.print("Ingrese el titulo del libro: ");
            libro.setNombreDelTitulo(sca.next());
            System.out.println("===========================");
            libros.add(libro);
            System.out.print("Desea agregar otro libro a la libreria? ");
            resp = sca.next();
            
        } while (resp.equalsIgnoreCase("si"));
        
        /* 
        En el bucle for each se instancia al objeto con nombre l1 para que
        recorra y muestre la arrayList libros.
        */
        for(Libreria l1 : libros){
            System.out.println(l1);
        }
        
        
    }

}
