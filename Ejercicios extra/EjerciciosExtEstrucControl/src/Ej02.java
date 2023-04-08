
public class Ej02 {

    public static void main(String[] args) {
        // Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
        // valor diferente a cada una. A continuación, realizar las instrucciones 
        // necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
        // el valor de D y D tome el valor de B. Mostrar los valores iniciales y 
        // los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        
        int a = 2, b = 10, c = 15 , d = 8, x = 0;
        
        System.out.println("Valores antes del cambio "+a+" "+b+" "+c+" "+d);
        
        x = b;
        b = c;
        c = a;
        a = d;
        d = x;
       
        System.out.println("Valores luego del cambio "+a+" "+b+" "+c+" "+d);
        
    }
    
}
