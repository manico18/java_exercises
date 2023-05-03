
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author MATIAS
 */
public class ParDeNumerosServicio {

    ParDeNumeros n = new ParDeNumeros();
    
    public void mostrarNumeros (){
        System.out.println("El valor del numero 1 es: " + n.getNum1());
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.println("El valor del numero 2 es: " + n.getNum2());
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
    }
    
    public double devolverMayor (){ 
        
        return Math.max(n.getNum1(), n.getNum2());
    }
    
    public double  calcularPotencia(){
        double mayor = devolverMayor();
        double menor = Math.min(n.getNum1(), n.getNum2()); 
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        System.out.println("Numero mayor redondeado " + mayor);
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.println("Numero menor redondeado " + menor);
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.println("La potencia es: " + (Math.pow(mayor, menor)));
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        return menor;
    }
    
    public void calcularRaiz (){
        double menor = calcularPotencia();
        System.out.println("El valor absoluto del numero menor es: " + (Math.abs(menor)));
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.println("La raiz del numero menor es: " + (Math.sqrt(menor)));
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
    }

}
