
import java.util.Scanner;


public class Ej06 {

    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 
        al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y 
        determine si este cuadrado es mágico o no. El programa deberá comprobar 
        que los números introducidos son correctos, es decir, están entre el 1 y 
        el 9.
        */
        
        Scanner sca = new Scanner(System.in);
        
        int num,matriz[][] = new int [4][4];
        int sumaFila = 0, sumaFila1=0,sumaFila2=0, sumaColumna = 0, sumaColumna1=0,sumaColumna2=0;
        int sumaDiagonal = 0,sumaDiagonalInv = 0;
        
        //Relleno de matriz por teclado
        System.out.println("Ingrese numeros del 1 al 9 para llenar la matriz: ");
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                 num = sca.nextInt();
                // Estructura que verifica que los numeros esten entre 1 y 9.
                 if(num >=1 && num <=9){
                     matriz[c][f]=num;
                 }else{
                     System.out.println("El numero ingresado no esta entre 1 y 9, ingreselo nuevamente.");  
                 }   
            }
        }
        
        // Mostrar matriz
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                System.out.print("["+matriz[c][f]+"]");  
            }
            System.out.println("");
        }  
        
        //suma Columna.
        for (int j = 0; j < 3; j++) {
            sumaColumna += matriz[j][0];
        }
        
        for (int j = 0; j < 3; j++) {
            sumaColumna1 += matriz[j][1];        
        }
        
        for (int j = 0; j < 3; j++) {
            sumaColumna2 += matriz[j][2]; 
        }
        
        // Suma diagonal.
        for (int i = 0; i < 3; i++) {
                sumaDiagonal += matriz[i][i];       
        }
        
        // Suma diagonal invertida.
        for (int i = 0; i < 3; i++) {
                sumaDiagonalInv += matriz[i][2-i];                     
        }
        
        // Suma de filas.
        for (int i = 0; i < 3; i++) {
            sumaFila += matriz[0][i];
        }
        
        for (int i = 0; i < 3; i++) {
            sumaFila1 += matriz[1][i];
        }
        
        for (int i = 0; i < 3; i++) {
            sumaFila2 += matriz[2][i];
        }
        
        if (sumaFila == sumaFila1 && sumaFila2 == sumaFila1 && sumaFila2==sumaColumna && sumaColumna == sumaColumna2 && sumaColumna1==sumaColumna2 && sumaDiagonal == sumaColumna2 && sumaDiagonalInv == sumaDiagonal){
            
            System.out.println("La matriz es un cubo magico");
        } else{
            System.out.println("La matriz no es un cubo magico");
        } 
        
    }
}