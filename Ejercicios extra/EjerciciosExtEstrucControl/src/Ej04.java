
import java.util.Scanner;


public class Ej04 {

    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
        muestre su equivalente en romano.
        */
        
        Scanner sca = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = sca.nextInt();
        
        if (num>=1 && num<=10){
            
            switch(num){
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("IIX");
                    break;  
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("x");
                    break; 
               
            }
        }else{
            System.out.println("El numero ingresado no esta entre 1 y 10");
        }
    }
    
}
