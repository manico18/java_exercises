
package Servicio;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author MATIAS
 */
public class AlumnosServicio {

    public ArrayList<Alumnos> crearListaAlumnos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumnos> alumno = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumnos a = new Alumnos();
            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(leer.next());
            System.out.println("Ingresa las notas del alumno");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            a.setNotas(notas);
            alumno.add(a);
            System.out.println("Desea ingresar otro alumno? Si/No");
            if (leer.next().equalsIgnoreCase("no")) {
                confirmacion = false;
            }
        } while (confirmacion);
        return alumno;
    }

    public Double buscarAlumno(ArrayList<Alumnos> alumnos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final");
        String alumnoABuscar = leer.next();
        Iterator<Alumnos> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumnos alumnoAuxiliar = it.next();
            if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)) {
                return promedioNotas(alumnoAuxiliar);
            }
        }
        System.out.println("NO se encontró el alumno");
        return null;
    }

    public double promedioNotas(Alumnos a) {
        double sumaNotas = 0;
        for (Integer nota : a.getNotas()) {
            sumaNotas += nota;
        }
        return sumaNotas / a.getNotas().size();
    }
    
}
