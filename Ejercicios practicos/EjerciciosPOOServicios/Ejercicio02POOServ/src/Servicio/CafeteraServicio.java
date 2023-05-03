package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class CafeteraServicio {

    private Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {

        Cafetera c1 = new Cafetera();

        c1.setCanAct(c1.getCanMax());

        System.out.println("La cafetera tiene actualmente: " + c1.getCanAct() + " ml.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        return c1;
    }

    public void menu(Cafetera c1) {

        String op;

        do {

            System.out.println("Ingrese una opcion del menu");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("a).Servir taza.\nb).Vaciar cafetera.\nc).Agregar cafe.\n"
                    + "d).Salir.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            op = sca.next();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (op.toUpperCase()) {

                case "A":
                    servirTaza(c1);
                    break;
                case "B":
                    vaciarCafetera(c1);
                    break;
                case "C":
                    agregarCafe(c1);
                    break;
                case "D":
                    System.out.println("Gracias por usar nuestro dispositivo");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        } while (!op.equalsIgnoreCase("D"));
    }
        

    public Cafetera servirTaza(Cafetera c1) {
        int taza;

        System.out.println("Ingrese el tamaño de la taza en ml.");
        taza = sca.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (taza > c1.getCanAct()) {
            System.out.println("La cantidad de cafe no alcanza para llenar su taza, se servira de todos modos lo que quede en la cafetera.");
            c1.setCanAct(c1.getCanAct());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Se ha servido en su taza: " + c1.getCanAct() + " ml de cafe.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else {
            System.out.println("Su taza se lleno en su totalidad.");
            c1.setCanAct(c1.getCanAct() - taza);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        return c1;
    }

    public Cafetera vaciarCafetera(Cafetera c1) {

        c1.setCanAct(0);
        System.out.println("La Cantidad actual de cafe en la maquina es: " + c1.getCanAct() + " ml.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        return c1;
    }

    public Cafetera agregarCafe(Cafetera c1) {

        System.out.println("Cuanto cafe quiere agregar a la maquina");
        int num = sca.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if(num > c1.getCanMax()){
            System.out.println("La cantidad de cafe que quiere ingresar en la maquina supera su limite.\n"
                    + "La capacidada maxima de la cafetera es " + c1.getCanMax() + " ml.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }else{
            c1.setCanAct(c1.getCanAct() + num);
            System.out.println("Se ha agregado a la maquina: " + num + " ml, el total de cafe en la maquina es de: " + c1.getCanAct() + " ml.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        }
      
        return c1;
    }

}
