
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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una obra social tiene tres clases de socios:
        
       // Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
       // descuento en todos los tipos de tratamientos.
       
       // Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
       // descuento para los mismos tratamientos que los socios del tipo A.
       
       // Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
       // sobre dichos tratamientos.
       
       // Solicite una letra (carácter) que representa la clase de un socio, y luego 
       // un valor real que represente el costo del tratamiento (previo al descuento) 
       // y determine el importe en efectivo a pagar por dicho socio.
       
       Scanner sca = new Scanner(System.in);
       
       String op;
       int valT,pago;
     
       
        
        System.out.println("Ingrese un opcion:\na) Socios tipo A\nb) Socios tipo B\nc) Socios tipo C");
        op = sca.next();
        op = op.toLowerCase();
        System.out.println("===============================");
        
        
        System.out.print("Ingrese el costo del tratamiento:");
        valT = sca.nextInt();
        
        
       switch (op){
           case "a":
               System.out.println("El total a abonar es: " + (pago = (valT*50)/100)+"$");
               break;
            
           case "b":
               System.out.println("El total a abonar es: " + (pago = (valT*35)/100)+"$");
               break;
            
            case "c":
               System.out.println("El total a abonar es: " + valT +"$");
               break;  
               
           }
                
          
        
            
       }
       
       

    }
    

