package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class PaisesServicio {

    private Scanner sca = new Scanner(System.in).useDelimiter("\n");
    private HashSet<String> paises = new HashSet();

    public void agregarPaises() {

        boolean ifsi = true;

        do {

            System.out.print("Ingrese un pais: ");
            String nomPais = sca.next();
            System.out.println("========================================================");
            paises.add(nomPais);

            do {

                System.out.print("Desea ingresar un pais mas: ");
                String resp = sca.next();
                System.out.println("========================================================");
                if (resp.equalsIgnoreCase("si") && resp.equalsIgnoreCase("no")) {
                } else if (resp.equalsIgnoreCase("no")) {
                    ifsi = false;
                } else if (resp.equalsIgnoreCase("si")) {
                    break;
                } else {
                    System.out.println("La opcion ingresada es incorrecta, ingresela nuevamente");
                    System.out.println("========================================================");
                }

            } while (ifsi);

        } while (ifsi);

        System.out.println("=====PAISES=AGREGADOS=AL=CONJUNTO=====");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void ordenarAlfabeticamente() {

        ArrayList<String> paiOr = new ArrayList(paises);
        Collections.sort(paiOr);

        System.out.println("=====PAISES=ORDENADOS=ALFABETICAMENTE=====");
        for (String string : paiOr) {
            System.out.println(string);
        }
    }

    public void eliminarPais() {

        int cont = 0;
        boolean ifsi = true;

        do {

            System.out.println("========================================================");
            System.out.print("Ingrese el pais que desea sacar del conjunto: ");
            String pais = sca.next();
            System.out.println("========================================================");
            
            Iterator<String> it = paises.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(pais)) {
                    it.remove();
                    cont++;
                    ifsi = false;
                    
                }
            }

            if (cont == 0) {
                System.out.println("El pais ingresado no se encuentra en el conjunto, intentelo nuevamente");
            }

        } while (ifsi);

        System.out.println("=====PAISES=CONJUNTO=FINAL=====");
        for (String paise : paises) {
            System.out.println(paise);
        }

    }

}


