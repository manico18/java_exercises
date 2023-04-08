
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        // Se dispone de un conjunto de N familias, cada una de las cuales tiene 
        // una M cantidad de hijos. Escriba un programa que pida la cantidad de 
        // familias y para cada familia la cantidad de hijos para averiguar la 
        // media de edad de los hijos de todas las familias.
        
        Scanner leer = new Scanner(System.in);

        float cantHijos, edadHijos, totalHijos = 0, totalEdad = 0;

        System.out.println("Cuantas familias ingresará?");
        int cantFamilias = leer.nextInt();

        for (int f = 0; f < cantFamilias; f++) {
            System.out.println("Cuantos hijos tiene la familia " + (f + 1));
            cantHijos = leer.nextInt();

            totalHijos += cantHijos;

            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese la edad de los hijos: ");
                edadHijos = leer.nextInt();

                totalEdad += edadHijos;
            }
        }
        System.out.println("La edad media de todos los hijos es de: " + (totalEdad /= totalHijos));
    }

}
