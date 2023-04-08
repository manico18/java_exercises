package entidad;

/**
 *
 * @author MATIAS
 */
public class Circunferencia {

    private double radio;
    

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
        
    }

    public double getRadio() {
        return radio;
    }

    public double calArea(double area) {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calPeri(double perimetro) {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    }
    
    


