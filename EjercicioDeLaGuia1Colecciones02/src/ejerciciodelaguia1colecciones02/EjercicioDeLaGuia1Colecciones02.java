
package ejerciciodelaguia1colecciones02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia1Colecciones02 {

    public static void main(String[] args) {
         /*
        Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        */
       
    ArrayList <Integer> numerosA = new ArrayList();
    int x = 20;
    int y = 30;
    int k = 0;
    int j = 5;
    int m = 78;
    numerosA.add(m);
    numerosA.add(j);
    numerosA.add(x);
    numerosA.add(y);
    numerosA.add(k);
    numerosA.remove(m);

    HashSet <Double> numerosB = new HashSet();
    double l = 1.5;
    double n = 8.654;
    double d = 1000.25;
    double c = 150.23;
    double b = 0.123;
    numerosB.add(b);
    numerosB.add(d);
    numerosB.add(l);
    numerosB.add(n);
    numerosB.add(c);
    numerosB.remove(b);
    
    HashMap <Integer,String> nombDNI = new HashMap();
    int Dni1 = 34146244;
    String nombre1 = "Matias";
    int Dni2 = 33156256;
    String nombre2 = "Federico";
    int Dni3 = 4156789;
    String nombre3 = "Alfredo";
    int Dni4 = 947789456;
    String nombre4 = "Elpidio";
    nombDNI.put(Dni1, nombre1);
    nombDNI.put(Dni2, nombre2);
    nombDNI.put(Dni3, nombre3);
    nombDNI.put(Dni4, nombre4);
    nombDNI.remove(Dni1);
    }
        
        

    }


