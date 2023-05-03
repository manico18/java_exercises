
package Entidad;

/**
 *
 * @author MATIAS
 */
public class CuentaBancaria {

    private int numCuenta;
    private long dniClien;
    private double saldoActu;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, long dniClien, double saldoActu) {
        this.numCuenta = numCuenta;
        this.dniClien = dniClien;
        this.saldoActu = saldoActu;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public long getDniClien() {
        return dniClien;
    }

    public double getSaldoActu() {
        return saldoActu;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDniClien(long dniClien) {
        this.dniClien = dniClien;
    }

    public void setSaldoActu(double saldoActu) {
        this.saldoActu = saldoActu;
    }

}
