
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATIAS
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente 
        // en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner sca = new Scanner (System.in);
        
        int grados,far;
        
        System.out.println("Ingrese la temperatura actual:");
        grados = sca.nextInt();
        
        far = 32 + (9*grados/5);
        System.out.println("La Temperatura en grados farenheit es: " + far);
        
    }
    
}
