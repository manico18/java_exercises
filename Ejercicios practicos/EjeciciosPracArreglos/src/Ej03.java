
public class Ej03 {

    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 
        dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
        int array[]=new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            array[i]=(int) (Math.random()*100000);
            
        }
        int j=0,k=0,l=0,n=0,m=0;
        
        for (int i = 0; i < 10; i++) {
            if(array[i] >=0 && array[i] <=9){
                j++;  
            }else if(array[i] >=10 && array[i] <=99){
                k++;        
            }else if(array[i] >=100 && array[i] <=999){
                l++;    
            }else if(array[i] >=1000 && array[i] <=9999){
                n++;   
            }else if(array[i] >=10000 && array[i] <=99999){
                m++;}
            }  
        
        System.out.println("Cantidad de numeros de 1 digitos en el vector: " + j);        
        System.out.println("Cantidad de numeros de 2 digitos en el vector: " + k);
        System.out.println("Cantidad de numeros de 3 digitos en el vector: " + l);
        System.out.println("Cantidad de numeros de 4 digitos en el vector: " + n);
        System.out.println("Cantidad de numeros de 5 digitos en el vector: " + m);
    }   
}                                                                                                                                                                                   