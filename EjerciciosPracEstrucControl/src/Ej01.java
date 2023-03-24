
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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        
        Scanner sca = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num = sca.nextInt();
        
        if( num%2==0 ){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");}    
        }
    }


