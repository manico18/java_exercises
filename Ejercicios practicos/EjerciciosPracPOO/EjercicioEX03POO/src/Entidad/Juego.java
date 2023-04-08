
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Juego {

    public int jugador1;
    public int jugador2;
    public int num1;
    public int num2;


    public Juego() {
    }

    public Juego(int jugador1, int jugador2, int num1, int num2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num1 = num1;
        this.num2 = num2;
    }

    Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public void inicarJuego(int i) {

        String op = "SI";
        boolean ban = true;

        System.out.print("Jugador 1 ingrese un numero para que sea adivinado:");
        num1 = (sca.nextInt());
        System.out.println("=======================================");
        
        do {

            System.out.print("Jugador_2 es su turno, ingrese un numero:");
            num2 = sca.nextInt();
            System.out.println("=======================================");
            i++;

            if (i == 5) {

                System.out.println("Jugador 2 ha perdido, se le acabaron los " + i + " intentos");
                jugador1 += 1;
                System.out.println("=======================================");
                System.out.println("Desea volver a jugar?");
                op = sca.next();

                while (ban == true && op.equalsIgnoreCase("SI")) {
                    System.out.print("Jugador 1 ingrese un numero para que sea adivinado:");
                    num1 = (sca.nextInt());
                    System.out.println("=======================================");
                    i = 0;
                    break;
                }

            } else if (num2 == num1) {

                System.out.println("Felicidades jugador 2 ha ganado, ah utilizado " + i + " intentos de 5.");
                jugador2 += 1;
                System.out.println("=======================================");
                System.out.println("Desea volver a jugar?");
                op = sca.next();

                while (ban == true && op.equalsIgnoreCase("SI")) {
                    System.out.print("Jugador 1 ingrese un numero para que sea adivinado:");
                    num1 = (sca.nextInt());
                    System.out.println("=======================================");
                    i = 0;
                    break;
                }

            } else if (num2 > num1) {

                System.out.println("Ingrese un numero mas bajo");
                System.out.println("=======================================");

            } else {

                System.out.println("Ingrese un numero mas alto");
                System.out.println("=======================================");
            }

        } while (!op.equalsIgnoreCase("no"));

    }
}
    
