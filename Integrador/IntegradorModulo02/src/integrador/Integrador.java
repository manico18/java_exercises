
package integrador;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Integrador {

    public static void main(String[] args) {
        /*
        Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron 
        el examen final. La escuela nos ha pedido que calculemos el promedio de notas
        final de todos sus alumnos y saber qué alumnos han recibido una nota por
        encima de ese promedio. Para esto vamos a tener que crear un objeto de tipo
        Estudiante, sus atributos van a ser nombre y nota(representando la nota 
        obtenida en el final). La escuela consta con tan solo 8 estudiantes, por
        lo que deberemos crear los 8 estudiantes con sus respectivas notas. Una 
        vez creado los estudiantes deberemos guardar los estudiantes en un arreglo
        de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
        dos tareas que nos ha pedido la escuela.
        
        1. Calcular y mostrar el promedio de notas de todo el curso 
        
        2. Retornar otro arreglo con los nombres de los alumnos que recibieron una 
        nota mayor al promedio del curso .
        
        3. Por último, deberemos mostrar todos los estudiantes con una nota mayor
        al promedio. 
        
        Nota: para crear un vector de objetos la definición es la siguiente: 
        Objeto nombreVector[] = new Objeto[];
        */
     
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        Estudiante [] estudiantes = new Estudiante[1];
        
        for (int i = 0; i <estudiantes.length ; i++) {
            
            System.out.println("Ingrese el nombre del estudiante N°: " + (i+1));
            String nombre = sca.next();
            System.out.println("=============================================");
            System.out.println("Ingrese la nota del estudiante: " + nombre);
            double nota = sca.nextDouble();
            System.out.println("=============================================");
            estudiantes [i] = new Estudiante (nombre,nota);
        }
        
        double sumaN = 0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            
            sumaN += estudiantes[i].getNota(); 
        }
        double prom;
        prom = sumaN/estudiantes.length;
        System.out.println("El promedio de notas de los alumnos es: " + prom);
        System.out.println("=============================================");
        
        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            
            if(estudiantes[i].getNota()>prom){
                contador++;
            }
            
        }
        String estudiantesNom[] = new String [contador];
        
        for (int i = 0; i < estudiantesNom.length; i++) {
            
            estudiantesNom[i] = estudiantes[i].getNombre();
            
        }
        
        for (int i = 0; i < estudiantesNom.length; i++) {
            
            System.out.println("Los estudiantes que tienen una nota mayor al promedio son: " + estudiantesNom[i]);
         
        }
        
        }
    }
