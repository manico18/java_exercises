
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Rectangulo {
public int lado1;
public int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    public int calArea(int area){
    
        area = lado1 * lado2;
        return area;
    }
}
