
import java.util.Scanner;


public class Ej02 {

    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales 
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
        entre los elementos).
        */
        
        Scanner sca = new Scanner(System.in);
        
        int vectorA[] = new int [4];
        int vectorB[] = new int [4];
        
        System.out.println("Ingrese numeros para vector A");
        for (int i = 0; i < 3; i++) {
            vectorA[i] = sca.nextInt();        
        }
        
        System.out.println("Ingrese numeros para vector B");
        for (int i = 0; i < 3; i++) {
            vectorB[i] = sca.nextInt();        
        }
        
        //Muestro vector A.
        for (int i = 0; i < 3; i++) {
            System.out.print("["+vectorA[i]+"]");   
        }
        
        System.out.println("");
        System.out.println("==============");
        
        //Muestro vector b.
        for (int i = 0; i < 3; i++) {
            System.out.print("["+vectorB[i]+"]");   
        }
        System.out.println("");
        
        //Comparar vectores.
        for (int i = 0; i < 2; i++) {
          
            switch(i){
                case 1:
                    if(vectorA[0]==vectorB[0]){
                        System.out.println("Los valores del primer indice son iguales");
                    }else{
                        System.out.println("Los valores del primer indice no son iguales");
                        break;
                    }
                case 2:  
                    if(vectorA[1]==vectorB[1]){
                        System.out.println("Los valores del segundo indice son iguales");
                    }else{
                        System.out.println("Los valores del segundo indice no son iguales");
                        break;
                    }
                case 3:
                    if(vectorA[2]==vectorB[2]){
                        System.out.println("Los valores del tercer indice son iguales");
                    }else{
                        System.out.println("Los valores del tercer indice no son iguales");
                        break;
                    }
            }
  
        }
    }
    
}
