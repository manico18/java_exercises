
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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que nos pida un número por teclado y con una función 
        se lo pasamos por parámetro para que nos indique si es o no un número primo, 
        debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
        17 si es primo.
        */
        
        Scanner sca = new Scanner(System.in);
        
        int num;
        System.out.print("Ingrese un numero: ");
        num = sca.nextInt();
        
        System.out.println("El numero es primo: " + numPrimo(num));
    }
    
    public static boolean numPrimo(int num){
        int j = 0;
        boolean ban = true;
        for (int i = 2; i < num+1; i++) {
            System.out.println(i);
            if(num%i==0){
              j++;
            }
            if(j>1){
                ban = false;
        
}

    }   
    return ban;
}
}