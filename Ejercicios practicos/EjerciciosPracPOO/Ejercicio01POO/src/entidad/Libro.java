package entidad;

public class Libro {

    public int ICBN;
    public String titulo;
    public String autor;
    public int numDePag;

    public Libro() {
    }

    public Libro(int ICBN, String titulo, String autor, int numDePag) {
        this.ICBN = ICBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ICBN=" + ICBN + ", titulo=" + titulo + ", autor=" 
                + autor + ", numDePag=" + numDePag + '}';
    }
    
   
}
