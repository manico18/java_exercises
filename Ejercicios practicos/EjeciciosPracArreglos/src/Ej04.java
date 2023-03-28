
public class Ej04 {

    public static void main(String[] args) {
        /*
        Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios 
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
        A se denota por B y se obtiene cambiando sus filas por columnas 
        (o viceversa).
        */
        
        int matriz[][] = new int [4][4];
        
        //Rellenar matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { 
                matriz[i][j] = (int)(Math.random()*10); 
            }   
        }
        
        //Mostrar matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }   
                System.out.println(" ");
        }
        
        System.out.println("============");
        System.out.println("============");
        
        //Mostrar matriz traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }   
                System.out.println(" ");
        } 
        
    }   
}
