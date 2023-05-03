package Entidad;

/**
 *
 * @author MATIAS
 */
public class Cafetera {

    private int canMax;
    private int canAct;

    public Cafetera() {
    this.canMax = 1500;
    }

    public Cafetera(int canMax, int canAct) {
        this.canMax = canMax;
        this.canAct = canAct;
    }

    public int getCanMax() {
        return canMax;
    }

    public int getCanAct() {
        return canAct;
    }

    public void setCanMax(int canMax) {
        this.canMax = canMax;
    }

    public void setCanAct(int canAct) {
        this.canAct = canAct;
    }

    

}
