
package ejerciciodelaguia1colecciones04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MATIAS
 */
public class EjercicioDeLaGuia1Colecciones04 {

    public static void main(String[] args) {
        /*
        DETECCIÓN DE ERRORES
        ArrayList<String> = new ArrayList()
        bebidas.put(“café);
        bebidas.add(“té”);
        Iterator<String> it =bebidas.iterator();
        whale (it.next()){
        if (it.next().equals(“café”)){
        it.remove();
        }
         */

        ArrayList<String> bebidas= new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        
        Iterator<String> it = bebidas.iterator();
        
        while (it.hasNext()){
        if (it.next().equals("café")){
        it.remove();
        }
        }

}
}
