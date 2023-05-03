
package Servicio;

import entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class RaicesServicio {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    
    public Raices completar (){
        
        Raices r = new Raices ();
        
        System.out.print("Ingrese el valor del operador a:");
        r.setA(sca.nextInt());
        System.out.print("Ingrese el valor del operador b:");
        r.setB(sca.nextInt());
        System.out.print("Ingrese el valor del operador c:");
        r.setC(sca.nextInt());
        
        return r;

    }
    
    public  double discriminante (Raices r){
            
     return Math.pow(r.getB(),2)-(4*r.getA()*r.getC());
    }
    
    public  boolean tieneRaices (Raices r){
       
    return discriminante(r) > 0; 
    }

   public  boolean tieneRaiz (Raices r){
    
   return discriminante (r) == 0; 
        
   }  
   
   public  void obtenerRaices (Raices r){
       
       if (tieneRaices (r)){
       double s1 = -r.getB()+Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())/(2*r.getA()));
       double s2 = -r.getB()-Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())/(2*r.getA()));
       System.out.println("La primera solucion es s1 " + s1);
       System.out.println("La segunda solucion es s2 " + s2);
       }else{
           System.out.println("Solo tiene una solucion");
       }
      
   }
   
   public  void obtenerRaiz (Raices r){
       
       if(tieneRaiz(r)){
           double s3 = -r.getB()+Math.sqrt(Math.pow(r.getB(),2)-(4*r.getA()*r.getC())/(2*r.getA()));
       System.out.println("La unica solucion es s3 " + s3);
       }
      
   }
   
   public  void calcular (Raices r,double s1, double s2, double s3){
       
       if(tieneRaices(r)){
           obtenerRaices(r);
            
       } else if (tieneRaiz(r)) {
           obtenerRaiz(r);
        }else{
           System.out.println("No tiene solucion");
       }
   }
    
    
    
}
