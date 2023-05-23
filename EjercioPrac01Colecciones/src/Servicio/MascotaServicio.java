package Servicio;

import entidad.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class MascotaServicio {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    Mascota r = new Mascota();
    ArrayList<String> razas = new ArrayList();

    public void agregarRazas() {

        String op;

        do {
            System.out.print("Ingrese la raza del perro: ");
            r.setRaza(sca.next());
            System.out.println("==============================");
            razas.add(sca.next());
            System.out.print("Desea agregar otra raza: ");
            op = sca.next();
            System.out.println("==============================");
            
        } while (op.equalsIgnoreCase("si"));

    }

    public void mostrarRazas() {
        System.out.println("Las Razas de perros en la lista son: ");
        System.out.println("==============================");

        for (String raza : razas) {
            System.out.println(raza);
            System.out.println("==============================");
        }
        System.out.println("");
    }

    public void eliminarRaza() {
        Iterator<String> it = razas.iterator();
        System.out.print("Ingrese una raza de perro a buscar en la lista: ");
        r.setRaza(sca.next());
        System.out.println("==============================");

        int cont = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(r.getRaza())) {
                it.remove();
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("La raza ingresada no se encuentra en la lista");
            System.out.println("==============================");
        }

        Collections.sort(razas);
        for (String raza : razas) {
            System.out.println(raza);
            System.out.println("==============================");
        }

    }

}      
    

    
    


