
package Servicio;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class MesesServicio {

    public void adivinarMes(){
        
    String meses[] = new String [12];
    
    
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
        meses [0] = "enero";
        meses [1] = "febrero";
        meses [2] = "marzo";
        meses [3] = "abril";
        meses [4] = "mayo";
        meses [5] = "junio";
        meses [6] = "julio";
        meses [7] = "agosto";
        meses [8] = "septiembre";
        meses [9] = "octubre";
        meses [10] = "noviembre";
        meses [11] = "diciembre";
    
        String mesSecre = meses[9];
        String mesIngre;
        
        do {
            System.out.print("Ingrese el nombre del mes en minuscula: ");
            mesIngre = sca.next();
            
            if(mesIngre.equals(mesSecre)){
                
                System.out.println("!!FELICIDADES HA ADIVINADO!! " + mesIngre + " ES EL MES SECRETO.");
            }else{
                System.out.println("Vuelva a intertar, " + mesIngre + " no es el mes secreto.");
            }
            
        } while (!mesIngre.equals(mesSecre));
       
    }
   
}
