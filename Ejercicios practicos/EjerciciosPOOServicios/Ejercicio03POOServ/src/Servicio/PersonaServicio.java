package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class PersonaServicio {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona p = new Persona();
        System.out.print("Ingrese su nombre: ");
        p.setNombre(sca.next());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Ingrese su apellido: ");
        p.setApellido(sca.next());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Ingrese su edad: ");
        p.setEdad(sca.nextInt());
        // Subproceso para determinar si la persona es mayor de edad
        System.out.println("La persona es mayor de edad: " + esMayorDeEdad(p));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");

        do {
            System.out.print("Ingrese su sexo: ");
            p.setSexo(sca.next());
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");

            if (!p.getSexo().equalsIgnoreCase("h") && !p.getSexo().equalsIgnoreCase("m")
                    && !p.getSexo().equalsIgnoreCase("o")) {
                System.out.println("El valor ingresado es incorrecto.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            } else {
                break;
            }
        } while (true);

        System.out.print("Ingrese su altura: ");
        p.setAltura(sca.nextDouble());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Ingrese su peso: ");
        p.setPeso(sca.nextDouble());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        return p;

    }

    //Metodo para determinar si la persona es mayor de edad.
    public boolean esMayorDeEdad(Persona p) {

        return p.getEdad() >= 18;
    }

    public int calcularIMC(Persona p) {

        double imc = (p.getPeso()) / Math.pow(p.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

}
