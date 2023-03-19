
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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que valide si una nota esta entre 0 y 10, sino 
        // esta entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
        
        Scanner sca = new Scanner (System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota:");
        nota = sca.nextByte();
        
        while(nota>10 || nota<0){
            System.out.println("La nota ingresada es invalida, ingresela nuevamente");
            nota = sca.nextByte();
            continue;}
        
        while (nota <=10 || nota>=0){
            System.out.println("La nota ingresada es " + nota);
            break;}
        
         
            
        
        
        
    }
}

