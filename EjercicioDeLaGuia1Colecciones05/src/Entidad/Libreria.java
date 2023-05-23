
package Entidad;

import java.util.Comparator;

/**
 *
 * @author MATIAS
 */
public class Libreria {
private int numeroDelLibro;
private String nombreDelTitulo;

    public Libreria() {
    }

    public Libreria(int numeroDelLibro, String nombreDelTitulo) {
        this.numeroDelLibro = numeroDelLibro;
        this.nombreDelTitulo = nombreDelTitulo;
    }

    public int getNumeroDelLibro() {
        return numeroDelLibro;
    }

    public String getNombreDelTitulo() {
        return nombreDelTitulo;
    }

    public void setNumeroDelLibro(int numeroDelLibro) {
        this.numeroDelLibro = numeroDelLibro;
    }

    public void setNombreDelTitulo(String nombreDelTitulo) {
        this.nombreDelTitulo = nombreDelTitulo;
    }
    
    @Override
    public String toString() {
        return "Libreria{" + "numeroDelLibro=" + numeroDelLibro + ", nombreDelTitulo=" + nombreDelTitulo + '}';
    }

    


}
