
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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        // Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo 
        // siguiente:
        
        Scanner sca = new Scanner(System.in);
        
        int num;
                
        System.out.println("Ingrese un numero");
        num = sca.nextInt();
        
        for (int f = 0; f < num; f++) {
            for (int j = 0; j < num; j++) {
                if (f > 0 && f<num - 1 && j > 0 && j < num-1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
