
public class Ej03 {

    public static void main(String[] args) {
        /*
        Crear una función que rellene un vector con números aleatorios, pasándole un
        arreglo por parámetro. Después haremos otra función o procedimiento que 
        imprima el vector.
        */
        
        int vector[] = new int [4];
        
         llenarVector (vector);
    }
    
    public static void llenarVector (int[] vector) {
      
        for (int i = 0; i < 3; i++) {
            vector [i] = (int) (Math.random()*10);  
        }
       mostrarVector(vector);
    }
    
    public static void mostrarVector(int[] vector) {
        
        for (int i = 0; i < 3; i++) {
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("");
    }
       
}
