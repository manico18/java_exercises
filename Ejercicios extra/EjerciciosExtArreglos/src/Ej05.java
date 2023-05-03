
public class Ej05 {

    public static void main(String[] args) {
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.
        */
        
        int suma=0,matriz[][] = new int[5][4];
          System.out.println("=================");
        for (int i = 0; i < 4; i++) {//columnas
            for (int j = 0; j < 3; j++) {//filas
                
                matriz[i][j] = (int)(Math.random()*10);
                
                System.out.print("["+matriz[i][j]+"]");
              
                suma += matriz[i][j];
                
            }
            System.out.println("");
        }
        System.out.println("=================");
        System.out.println("La suma de la matriz es: " + suma);
    }
    
}
