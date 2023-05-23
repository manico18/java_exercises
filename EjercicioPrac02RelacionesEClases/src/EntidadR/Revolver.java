package EntidadR;

/**
 *
 * @author MATIAS
 */
public class Revolver {

    private double posicionAc;
    private double posicionAg;

    public Revolver() { 
    }

    public Revolver(double posicionAc, double posicionAg) {
        this.posicionAc = posicionAc;
        this.posicionAg = posicionAg;
    }

    public double getPosicionAc() {
        return posicionAc;
    }

    public double getPosicionAg() {
        return posicionAg;
    }

    public void setPosicionAc(double posicionAc) {
        this.posicionAc = posicionAc;
    }

    public void setPosicionAg(double posicionAg) {
        this.posicionAg = posicionAg;
    }
    
    public void llenarPistola (){
        posicionAc = Math.floor(Math.random() * 7);
        posicionAg = Math.floor(Math.random() * 7);   
        
    }
    
    public void mojar (){
        boolean ifsi = false;
        if (posicionAc == posicionAg){
            ifsi = true;
        }
        
    }
    
    public void siguienteChorro(){
        if (posicionAc != posicionAg){
            
            for (int i = 0; i < 7; i++) {
                posicionAc = Math.floor(Math.random() * (i-1));
            }
            
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionAc=" + posicionAc + ", posicionAg=" + posicionAg + '}';
    }

}
