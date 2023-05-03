
package Entidad;

/**
 *
 * @author MATIAS
 */
public class Ahorcado {

    private String palaBus[];
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palaBus, int letrasEncontradas, int jugadasMax) {
        this.palaBus = palaBus;
        this.letrasEncontradas = 0;
        this.jugadasMax = 0;
    }

    public String[] getPalaBus() {
        return palaBus;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setPalaBus(String[] palaBus) {
        this.palaBus = palaBus;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
