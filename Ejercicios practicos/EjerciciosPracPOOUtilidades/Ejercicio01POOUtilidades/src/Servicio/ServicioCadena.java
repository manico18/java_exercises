
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class ServicioCadena {
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    Cadena frase1 = new Cadena();
    
    public void mostrarVocales(){

        int contador = 0;
        
        for (int i = 0; i < frase1.getLongitudF(); i++) {
            
            String vocal = frase1.getFrase().substring(i, i+1);
            
            if(vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || 
               vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || 
                    vocal.equalsIgnoreCase("u")){
                contador++;
            }
                
        }
        System.out.println("La cantidad de vocales en la frase ingresada son: " + contador);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }
    
    public void invertirFrase(){
        
        /*
        for (int i = 0; i < cad.getLongitud(); i++) {
        invert = invert.concat(cad.getFrase().substring(cad.getLongitud()-1-i, +
         + cad.getLongitud()-i));
        }
        */
   
       String fraseIn = "";
        for (int i = frase1.getLongitudF() -1; i >= 0 ; i--) {
            
         fraseIn += frase1.getFrase().charAt(i);
        }
        
        System.out.println("La frase invertida es: " + fraseIn);  
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
    public void vecesRepetido (){
        
        int contador = 0;
        
        System.out.print("Ingrese una letra: ");
        String letra = sca.next();
        
        for (int i = 0; i < frase1.getLongitudF(); i++) {
            
            String vocal = frase1.getFrase().substring(i, i+1);
            
            if (vocal.equalsIgnoreCase(letra)){
                contador++;
            }
        }
        
        System.out.println("La letra esta en la frase: " + contador + " veces.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
    public void compararLongitud (){
        System.out.print("Ingrese una frase para comparar su longitud con la frase ya ingresada: ");
        String nuevaFrase = sca.next();
        
        if(nuevaFrase.equalsIgnoreCase(frase1.getFrase())){
            System.out.println("Las frases tienen el mismo tamaño.");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }else{
            System.out.println("Las frases no tienen el mismo tamaño.");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
      
    }
    
    public void unirFrases (){
        
        System.out.print("Ingrese una frase para unirla con la primera frase ingresada: ");
        String nuevaFrase = sca.next();
        
        frase1.setFrase(frase1.getFrase().concat(nuevaFrase));
        
        System.out.println("La frase concatenada es: " + frase1.getFrase());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
    public void reemplazar(){
        
        System.out.print("Ingrese un caracter que desee intercambiar en la frase por la letra a: ");
        String letra = sca.next();
        
        frase1.setFrase(frase1.getFrase().replace("a", letra));
        
        System.out.println("La frase con caracteres reemplazados es: " + frase1.getFrase());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
    public void contiene (){
        
        System.out.print("Ingrese una letra para comprobar si se encuentra en la frase: ");
        String letra = sca.next();
        
        if (frase1.getFrase().contains(letra)){
        
            System.out.println("La letra ingreresada se encuentra dentro de la frase.");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }else{
            System.out.println("La letra ingresada no se encuentra en la frase.");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
 
    }
}
