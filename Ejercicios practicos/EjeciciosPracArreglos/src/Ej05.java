
public class Ej05 {

    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
        traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
        */
        
        int matriz[][] = new int [4][4];
        
        //Rellenar matriz
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3 ; f++) {
                matriz[c][f] = (int)(Math.random()*10);
            }
        }
        
        // Mostrar matriz
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {                
                System.out.print("["+matriz[c][f]+"]");  
            }
            System.out.println("");
        }
        
        // Mostrar matriz traspuesta
        System.out.println("============");
        System.out.println("============");
        boolean ban = true;
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {                
                System.out.print("["+matriz[f][c]+"]"); 
                
                if(matriz[c][f] == matriz[f][c]*(-1)){
                    ban = true;
                }else{
                    ban = false; 
                }
            }
            System.out.println("");
        }
        
        if(ban = true){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
