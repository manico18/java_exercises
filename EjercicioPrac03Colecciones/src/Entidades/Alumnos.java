
package Entidades;

import java.util.ArrayList;



/**
 *
 * @author MATIAS
 */
public class Alumnos {
    
private String nombre;
    private ArrayList<Integer> notas;

    public Alumnos(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", notas=" + notas + '}';
    }
}
