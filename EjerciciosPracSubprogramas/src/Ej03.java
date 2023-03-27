
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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crea una aplicación que a través de una función nos convierta una 
        cantidad de euros introducida por teclado a otra moneda, estas pueden 
        ser a dólares, yenes o libras. La función tendrá como parámetros, la 
        cantidad de euros y la moneda a convertir que será una cadena, este no 
        devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        
        Scanner sca = new Scanner(System.in);
        
        double euros;
        String moneda;
        System.out.print("Ingrese la cantidada de euros que desea convertir:");
        euros = sca.nextDouble();
        System.out.println("Seleccione la moneda a convertir:\n-Dolar\n-Yen\n-Libra");
        moneda = sca.next();
        moneda=moneda.toLowerCase();
        
        conversion(euros,moneda);
    }
    
    public static void conversion(double euros, String moneda){
        switch(moneda){
            case "dolar":
        System.out.println("La cantidad de euros pasada a dolar es: " + (euros * 1.286)+" Dolares");
        break;
            case "yen":
        System.out.println("La cantidad de euros pasada a Yenes es: " + (euros * 129.8)+" Yenes");
        break;
            case "libra":
        System.out.println("La cantidad de euros pasada a Libras es: " + (euros * 0.86)+" Libras");
        break;
            default:
                System.out.println("La moneda ingresada es incorrecta.");
                
        }
    }
}
