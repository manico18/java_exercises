package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Cuenta {

    public String usuario;
    public int saldo;

    public Cuenta() {
    }

    public Cuenta(String usuario, int saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public void retirarDinero() {
        String clave;

        do {

            System.out.print("Ingrese su usuario:");
            usuario = sca.next();
            System.out.println("===============================================");
            System.out.print("Ingrese su clave:");
            clave = sca.next();
            System.out.println("");

            if (usuario.equals("Matias") && clave.equals("Gravlax")) {
                System.out.println("Bienvenido!!!");
                System.out.println("============================================");
                break;
            } else {
                System.out.println("El usuario o la contraseña estan mal ingresados vuelva a intentarlo");
                System.out.println("");
            }
            
        } while (!usuario.equals("Matias") && !clave.equals("Gravlax"));

        
        saldo = 10000;
        String op;
        int num;

        do {

            System.out.println(usuario+", que operacion desea realizar:\nA) Retirar dinero.\nB) Ingresar dinero.\nC) Mostrar saldo. \nd)Salir del sistema.");
            System.out.println("===============================================");
            op = sca.next();

            switch (op.toUpperCase()) {

                case "A":
                    System.out.print("Cuanto dinero desea retirar:");
                    num = sca.nextInt();
                    System.out.println("===============================================");
                    
                    if (saldo < num) {
                        System.out.println("No tiene esa cantidad de dinero en su cuenta");
                        System.out.println("===============================================");
                    } else {
                        saldo -= num;
                    }
                    break;
                    
                case "B":
                    System.out.print("Cuanto dinero desea ingresar en su cuenta:");
                    num = sca.nextInt();
                    System.out.println("===============================================");
                    saldo += num;
                    break;
                    
                case "C":
                    System.out.println("El saldo disponible en su cuenta es: " + saldo);
                    System.out.println("===============================================");
                    break;
                
                case "D":
                    System.out.println("Gracias por utilizar nuestros cajeros, que tenga un buen dia.");
                    break;
                    
                default:
                    System.out.println("La opcion ingreresada no se encuentra en el menu.");
                    System.out.println("===============================================");
            }

        } while (!op.equalsIgnoreCase("D"));
    }

}
   

