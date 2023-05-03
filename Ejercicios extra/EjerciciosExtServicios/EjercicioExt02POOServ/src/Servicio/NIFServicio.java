
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class NIFServicio {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    String [] array = new String [23];
    
    public NIF crearNif(){
        
        NIF n = new NIF();
        
        System.out.print("Ingrese un numero de DNI: ");
        n.setDni(sca.nextLong());
        long num;
        num = n.getDni() % 23;
        
        for (int i = 0; i < array.length; i++) {
            
            array[i] = n.getLetra().substring(i, i+1);
        }
        
        for (int i = 0; i < array.length; i++) {
            
            if (num == i){
                String num1 = String.valueOf(array[i]);
                n.setLetra(num1);
            }
        }
        
        return n;
    }
    
    public void mostrarNIF (NIF n){
        
        System.out.println("El NIF es: " + n.getDni() + "-" + n.getLetra());
    }
}
