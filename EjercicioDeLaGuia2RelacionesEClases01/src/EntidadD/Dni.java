
package EntidadD;

/**
 *
 * @author MATIAS
 */
public class Dni {
    
   private long numeroDni;
   private char serie;

    public Dni() {
    }

    public Dni(long numeroDni, char serie) {
        this.numeroDni = numeroDni;
        this.serie = serie;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public char getSerie() {
        return serie;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dni{" + "numeroDni=" + numeroDni + ", serie=" + serie + '}';
    }
   
    
    
}
