
import java.util.Scanner;


public class Ej04 {
    
    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro 
        de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
        de aprobados y desaprobados. Durante el período de cursado cada alumno 
        obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
        Las ponderaciones de cada nota son:
        
        - Primer trabajo práctico evaluativo 10%
        - Segundo trabajo práctico evaluativo 15%
        - Primer Integrador 25%
        - Segundo integrador 50%
        
        Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        arreglo. Al final del programa los profesores necesitan obtener por 
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que 
        solo aprueban los alumnos con promedio mayor o igual a 7 de sus notas 
        del curso.
        */
        
        Scanner sca = new Scanner(System.in);
        
        double nota1,nota2,nota3,nota4,notaProm,vector[] = new double [3];
        int j=0,k=0;
        
        for (int i = 1; i < 3; i++) {
            System.out.println("alumno/a N° " +i);
            System.out.print("Ingrese la nota del primer trabajo practico evaluativo: ");
            nota1 = sca.nextDouble();
            System.out.println("==================================");
            System.out.print("Ingrese la nota del segundo trabajo practico evaluativo: ");
            nota2 = sca.nextDouble();           
            System.out.println("==================================");
            System.out.print("Ingrese la nota del primer integrador: ");
            nota3 = sca.nextDouble();           
            System.out.println("==================================");
            System.out.print("Ingrese la nota del segundo integrador: ");
            nota4 = sca.nextDouble();         
            System.out.println("==================================");
            notaProm = (nota1*0.10)+(nota2*0.15)+(nota3*0.25)+(nota4*0.50);
            System.out.print("El promedio del alumno N° " + i+" es: " +notaProm); 
            System.out.println("");
            vector[i]= notaProm ;   
            
            if(vector[i]>=7){
                j++;
            }else{
                k++;
            }
        }
        
        System.out.println("Alumnos aprobados: " +j);
        System.out.println("Alumnos desaprobados: " + k);
        
        }
        
       
        
    }
   

        
    

        
    
    

