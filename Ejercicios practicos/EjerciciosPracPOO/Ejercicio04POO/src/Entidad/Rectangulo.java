
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    public int supRectangulo(int sup) {
        System.out.println("Ingrese la base y la altura del rectangulo:");
        base = sca.nextInt();
        altura = sca.nextInt();
        
        sup = base * altura;
        return sup;
    }

    public int periRectangulo(int peri) {
        peri = (base + altura) * 2;
        return peri;
    }
    
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    public String dibuRectangulo(String dibujo) {
        
        
        
        for (int f = 0; f < altura; f++) {
            for (int j = 0; j < base; j++) {
                if (f > 0 && f < altura - 1 && j > 0 && j < base - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        return dibujo;
    }

}
