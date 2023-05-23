package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class TiendaServicio {

    private Scanner sca = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> listaProductos = new HashMap();
    private Tienda tA = new Tienda();

    public void menu() {

        int op;

        do {
            System.out.println("======MENU======");
            System.out.println("1)-Introducir un elemento.\n2)-Modificar precio de un producto.\n"
                    + "3)-Eliminar un producto.\n4)-Mostrar productos.\n5)-Salir.");
            System.out.println("================");
            System.out.print("Ingrese una opcion del menu: ");
            op = sca.nextInt();
            System.out.println("=================");

            switch (op) {
                case 1:
                    introducir();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra APP, que tenga un buen dia.");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta vuelva"
                                         + " a intentarlo.");
                    System.out.println("=================================================");
            }
            
        } while (op != 5);
    }

    public void introducir() {

        String resp;
        boolean ifsi = true;

        do {

            System.out.print("Ingrese el nombre del producto: ");
            tA.setProducto(sca.next());
            System.out.println("=================================================");
            System.out.print("Ingrese El precio del producto: ");
            tA.setPrecio(sca.nextDouble());
            System.out.println("=================================================");
            listaProductos.put(tA.getProducto(), tA.getPrecio());
            
            do {
                System.out.println("Desea agregar un producto mas?");
                resp = sca.next();
                System.out.println("=================================================");
                if (resp.equalsIgnoreCase("si") && resp.equalsIgnoreCase("no")) {
                } else if (resp.equalsIgnoreCase("no")) {
                    ifsi = false;
                } else if (resp.equalsIgnoreCase("si")) {
                    break;
                } else {
                    System.out.println("La respuesta ingresada es incorrecta, "
                                        + "ingresela nuevamente.");
                    System.out.println("=================================================");
                }
            } while (ifsi);

        } while (resp.equalsIgnoreCase("si"));
    }
    
    public void modificar(){
        
        System.out.print("Ingrese el nombre del producto al que desea cambiarle el"
                          + " precio: ");
        String produM = sca.next();
        System.out.println("===========================================================================");
        
        if(tA.getProducto().equalsIgnoreCase(produM)){
                System.out.print("Ingrese el precio modificado: ");
                tA.setPrecio(sca.nextDouble());
                System.out.println("===================================================================");
                listaProductos.put(tA.getProducto(), tA.getPrecio());
            }
    }
    
    public void eliminar(){
        
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        tA.setProducto(sca.next());
        listaProductos.remove(tA.getProducto());
        
    }
    
    public void mostrar(){
      
        System.out.println("======LISTA=DE=PRODUCTOS======");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            System.out.println("Nombre producto: " + (entry.getKey()) + " su precio es " + (entry.getValue()) + "$");
            
        } 
    }

}
