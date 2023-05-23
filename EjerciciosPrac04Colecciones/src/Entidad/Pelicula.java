
package Entidad;

import java.util.Comparator;

/**
 *
 * @author MATIAS
 */
public class Pelicula {

   private String titulo;
   private String director;
   private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

   public static Comparator <Pelicula> compararDuracion = new Comparator <Pelicula>(){
       @Override
       public int compare(Pelicula d1, Pelicula d2) {
          return d2.getDuracion().compareTo(d1.getDuracion());
       } 
   };
   
   public static Comparator <Pelicula> compararTitulo = new Comparator <Pelicula>(){
       @Override
       public int compare(Pelicula d1, Pelicula d2) {
          return d1.getTitulo().compareTo(d2.getTitulo());
       } 
   };
   
   public static Comparator <Pelicula> compararDirector = new Comparator <Pelicula>(){
       @Override
       public int compare(Pelicula d1, Pelicula d2) {
          return d1.getDirector().compareTo(d2.getDirector());
       } 
   };
}
