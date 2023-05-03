
package Entidad;

/**
 *
 * @author MATIAS
 */
public class NIF {

    private long dni;
    private String letra;

    public NIF() {
        this.letra = "TRWAGMYFPDXBNJZSQVHLCKE";
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
