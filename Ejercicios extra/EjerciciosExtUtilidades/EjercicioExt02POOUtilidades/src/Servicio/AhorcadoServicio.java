package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class AhorcadoServicio {

    Ahorcado a1 = new Ahorcado();
    Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.print("Ingrese una palabra: ");
        String palabra = sca.next();
        System.out.println("=====================================================");
        System.out.println("Ingrese el maximo de intentos que tendra el usuario: ");
        a1.setJugadasMax(sca.nextInt());
        System.out.println("=====================================================");

        //asignacion de longitud de palabra a vector
        a1.setPalaBus(new String[palabra.length()]);

        //llenar vector con palabra
        for (int i = 0; i < a1.getPalaBus().length; i++) {
            a1.getPalaBus()[i] = palabra.substring(i, i + 1);
        }
        return a1;
    }

    public Ahorcado longitud() {

        System.out.println("La longitud de la palabra a encontrar es: "
                + a1.getPalaBus().length + " caracteres.");
        System.out.println("=====================================================");
        return a1;
    }

    public String buscar() {

        System.out.print("Ingrese la letra que desea encontrar: ");
        String letra = sca.next();
        System.out.println("=====================================================");
        int acer = 0;
        int deAcer = 0;

        for (int i = 0; i < a1.getPalaBus().length; i++) {

            if (a1.getPalaBus()[i].equalsIgnoreCase(letra)) {
                acer++;
            } else {
                deAcer++;
            }
        }

        if (acer >= 1) {
            System.out.println("La letra ingresada esta en la palabra.");
            System.out.println("=========================================");
        } else {
            System.out.println("La letra ingresada no esta en la palabra.");
            System.out.println("=========================================");
        }

        return letra;
    }

    public Ahorcado encontradas() {

        int jugadasU = 0;
      
        
        String letra = buscar();

        for (int i = 0; i < a1.getPalaBus().length; i++) {
            
            if (a1.getPalaBus()[i].equalsIgnoreCase(letra)) {
                a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
            }
            
        }
        
        if (a1.getLetrasEncontradas() > 0) {
            System.out.println("Lleva encontradas: " + a1.getLetrasEncontradas()
                    + " letras.");
            a1.setLetrasEncontradas(a1.getPalaBus().length - a1.getLetrasEncontradas());
            System.out.println("Le quedan por encontrar: " + a1.getLetrasEncontradas());

        } else {
            jugadasU++;
            a1.setJugadasMax(a1.getJugadasMax() - jugadasU);

        } 
   
    return a1;
    }

    public Ahorcado intentos() {

        System.out.println("Le quedan: " + a1.getJugadasMax() + " intentos.");
        return a1;
    }

    public Ahorcado juego() {
        crearJuego();
        longitud();
        encontradas();
        intentos();   
      
      
        return a1;
    }
}
