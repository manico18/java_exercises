
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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Considera que estás desarrollando una web para una empresa que fabrica 
        // motores (suponemos que se trata del tipo de motor de una bomba para mover 
        // fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese 
        // un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        
        // o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba 
        // es una bomba de agua”.
        // o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es 
        // una bomba de gasolina”.
        // o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es 
        // una bomba de hormigón”.
        // o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es 
        // una bomba de pasta alimenticia”.
        // o Si no se cumple ninguno de los valores anteriores mostrar el mensaje 
        // “No existe un valor válido para tipo de bomba”.
        
        Scanner sca = new Scanner(System.in);
        
        int op;
        System.out.println("Ingrese una de las 4 opciones:\n"
                + "1- tipo de motor 1\n"
                + "2- tipo de motor 2\n"
                + "3- tipo de motor 3\n"
                + "4- tipo de motor 4");
        op = sca.nextInt();
        switch (op){
            case 1:
                System.out.println("Selecciono bomba de agua");
                break;
            case 2:
                System.out.println("Selecciono bomba de gasolina");
                break;
            case 3:
                System.out.println("Selecciono bomba de hormigon");
                break;
            case 4:
                System.out.println("Selecciono bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
