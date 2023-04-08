
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Empleado {
public String nombre;
public byte edad;
public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, byte edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    public void calSala (){
    
    System.out.print("Ingrese su nombre:");
    nombre = sca.next();
    System.out.println("====================");
    System.out.print("Ingrese su salario actual:");
    salario = sca.nextInt();
    System.out.println("====================");
    System.out.print("Ingrese su edad:");
    edad = sca.nextByte();
    System.out.println("====================");
    
    if (edad > 30){
        System.out.println("Le corresponde un aumento salarial del 10%");
        System.out.println("==========================================");
        System.out.println("Su salario con aumento es: " + (salario += (salario * 0.10)) + "$");
    }else{
        System.out.println("Le corresponde un aumento salarial del 5%");
        System.out.println("==========================================");
        System.out.println("Su salario con aumento es: " + (salario += (salario * 0.05)) + "$");
    }
}

}
