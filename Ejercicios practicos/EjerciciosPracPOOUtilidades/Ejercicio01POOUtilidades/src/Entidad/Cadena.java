
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Cadena {
    
    private String frase;
    private int longitudF;

    
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena() {
        System.out.print("Ingrese una frase: ");
        frase = sca.next();
        longitudF = frase.length();
    }

    public Cadena(String frase, int longitudF) {
        
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudF() {
        return longitudF;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitudF(int longitudF) {
        this.longitudF = longitudF;
    }
    
    
    
}
