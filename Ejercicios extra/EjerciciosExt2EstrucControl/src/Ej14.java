
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATIAS
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se dispone de un conjunto de N familias, cada una de las cuales tiene 
        // una M cantidad de hijos. Escriba un programa que pida la cantidad de 
        // familias y para cada familia la cantidad de hijos para averiguar la 
        // media de edad de los hijos de todas las familias.
        
         Scanner leer = new Scanner(System.in);
         
         
        float cantHijos, edadHijos, totalHijos = 0, totalEdad = 0;

        System.out.println("Cuantas familias ingresará?");
        int cantFamilias = leer.nextInt();

        for( int f = 0; f < cantFamilias; f++)
        {
            System.out.println("Cuantos hijos tiene la familia "+(f+1));
            cantHijos = leer.nextInt();

            totalHijos += cantHijos;

            for (int j = 0; j < cantHijos; j++)
            {
                System.out.println("Ingrese la edad de los hijos: ");
                edadHijos = leer.nextInt();

                totalEdad += edadHijos;
            }
        }
        System.out.println("La edad media de todos los hijos es de: "+(totalEdad /= totalHijos));
    }
    
}
