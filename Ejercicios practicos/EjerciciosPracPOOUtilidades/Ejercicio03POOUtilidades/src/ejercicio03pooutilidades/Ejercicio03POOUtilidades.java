
package ejercicio03pooutilidades;

import Servicio.arregloServicio;

/**
 *
 * @author MATIAS
 */
public class Ejercicio03POOUtilidades {

    public static void main(String[] args) {
        /*
        Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
        arreglo B de 20 números reales. Crear la clase ArregloService, en el 
        paquete servicio, con los siguientes métodos:
        
        a)-Método inicializarA recibe un arreglo por parámetro y lo inicializa 
        con números aleatorios.
        
        b)-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
        
        c)-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a
        menor.
        
        d)-Método inicializarB copia los primeros 10 números del arreglo A en el
        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
        
        e)-En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
        mostrar A y B.
        */
        
        double [] arrayA = new double [50];
        double [] arrayB = new double [20];
        
        arregloServicio aS = new arregloServicio();
        
        aS.inicializarA(arrayA);
        aS.mostrarA(arrayA);
        aS.ordenar(arrayA);
        aS.inicializarB(arrayB, arrayA);
        aS.mostrarAyB(arrayA, arrayB);
    }

}
