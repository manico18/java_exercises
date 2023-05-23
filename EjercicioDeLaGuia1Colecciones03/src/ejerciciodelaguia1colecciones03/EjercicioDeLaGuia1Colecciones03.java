
package ejerciciodelaguia1colecciones03;

import java.util.HashMap;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia1Colecciones03 {

    public static void main(String[] args) {
        /*
        DETECCIÓN DE ERRORES
        HashMap<Integer> personas = new HashMap<>;
        String n1 = “Albus”;
        String n2 = “Severus”;
        personas.add(n1);
        personas.add(n2);
        */
        
        HashMap<Integer, String> personas = new HashMap();
        int num1 = 1;
        String n1 = "Albus";
        int num2 = 2;
        String n2 = "Severus";
        personas.put(num1,n1);
        personas.put(num2,n2);

    }

}
