package entidad;

/**
 *
 * @author MATIAS
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sumar(int suma) {
        suma = num1 + num2;
        return suma;
    }

    public int restar(int resta) {
        resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int multi) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error uno o ambos numeros ingresados es 0.");
        } else {
            multi = num1 * num2;
        }
        return multi;
    }

    public float dividir(float divi) {
        if (num1 == 0 || num2 == 0) {

        } else {
            divi = num1 / num2;
        }
        return divi;
    }


}
