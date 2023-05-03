package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class CuentaBancariaServicio {

    private Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuen1 = new CuentaBancaria();

        System.out.print("Ingrese su numero de cuenta: ");
        cuen1.setNumCuenta(sca.nextInt());
        System.out.println("===============================");
        System.out.print("Ingrese su numero de DNI: ");
        cuen1.setDniClien(sca.nextLong());
        System.out.println("===============================");
        cuen1.setSaldoActu(10000);

        return cuen1;
    }

    public void menu(CuentaBancaria cuen1) {

        String op;

        do {
            System.out.println("Ingrese una opcion del menu");
            System.out.println("========================");
            System.out.println("a).Ingresar dinero.\nb).Retirar dinero.\nc).Extracion rapida de dinero.\n"
                    + "d).Consultar saldo.\ne).Consultar datos.\nf).Salir del sistema.");

            System.out.println("========================");
            op = sca.next();
            System.out.println("========================");
            double num;

            switch (op.toLowerCase()) {

                case "a":

                    ingresar(cuen1);

                    break;

                case "b":

                    retirar(cuen1);

                    break;

                case "c":

                    extraccionRapida(cuen1);

                    break;

                case "d":

                    consultarSaldo(cuen1);

                    break;

                case "e":

                    consultarDatos(cuen1);

                    break;

                case "f":
                    System.out.println("Gracias por su visita, que tenga un buen dia.");
                    break;

                default:
                    System.out.println("Error de ingreso.");
            }

        } while (!op.equalsIgnoreCase("f"));

    }

    public CuentaBancaria ingresar(CuentaBancaria cuen1) {
        System.out.println("Indique cuanto dinero desea ingresar a su caja de ahorro.");
        double num = sca.nextDouble();
        cuen1.setSaldoActu(cuen1.getSaldoActu() + num);
        System.out.println("======================");
        return cuen1;
    }

    public CuentaBancaria retirar(CuentaBancaria cuen1) {
        System.out.println("Indique cuanto dinero desea retirar de su caja de ahorro.");

        double num = sca.nextDouble();

        if (num > cuen1.getSaldoActu()) {
            System.out.println("No es posible retirar esa cantidad de dinero, "
                    + "saldo disponible en su cuenta " + cuen1.getSaldoActu() + "$");
            System.out.println("=============================================");

        } else if (num < cuen1.getSaldoActu()) {
            cuen1.setSaldoActu(cuen1.getSaldoActu() - num);
            System.out.println("===========================================");
        }

        return cuen1;
    }

    public CuentaBancaria extraccionRapida(CuentaBancaria cuen1) {
        System.out.println("Ingresa la cantidad de dinero que desea retirar.");
        double num = sca.nextDouble();

        if (num <= cuen1.getSaldoActu() * 0.20) {
            cuen1.setSaldoActu(cuen1.getSaldoActu() - num);
        } else {
            System.out.println("La cantidad de dinero ingresada supera el 20% del dinero en su cuenta.");
        }

        return cuen1;
    }

    public CuentaBancaria consultarSaldo(CuentaBancaria cuen1) {

        System.out.println("Su saldo actual es: " + cuen1.getSaldoActu() + "$");

        return cuen1;
    }

    public CuentaBancaria consultarDatos(CuentaBancaria cuen1) {
        System.out.println("Su numero de cuenta es: " + cuen1.getNumCuenta() + "\n"
                + "Su numero de DNI: " + cuen1.getDniClien());

        return cuen1;
    }

}
    


