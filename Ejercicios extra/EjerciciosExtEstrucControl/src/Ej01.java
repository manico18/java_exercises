
import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        // Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
        // su equivalente: 1 día, 2 horas.
        
        Scanner sca = new Scanner(System.in);

        int min, dia, hor, tDia;

        System.out.println("Ingrese los minutos:");
        min = sca.nextInt();

        tDia = 60 * 24;
        dia = min / tDia;
        hor = (min % tDia) / 60;

        System.out.println("Dias: " + dia);
        System.out.println("Horas: " + hor);

    }

}
