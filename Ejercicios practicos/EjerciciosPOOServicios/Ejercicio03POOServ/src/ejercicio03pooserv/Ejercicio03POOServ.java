
package ejercicio03pooserv;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author MATIAS
 */
public class Ejercicio03POOServ {

    public static void main(String[] args) {
        /*
        Realizar una clase llamada Persona en el paquete de entidades que tengan
        los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para 
        mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo,
        puede hacerlo. Agregar constructores, getters y setters.
        
        En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
        
        a).Método esMayorDeEdad(): indica si la persona es mayor de edad. 
        La función devuelve un booleano.
        
        b).Metodo crearPersona(): el método crear persona, le pide los valores 
        de los atributos al usuario y después se le asignan a sus respectivos 
        atributos para llenar el objeto Persona. Además, comprueba que el sexo 
        introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
        mostrar un mensaje.
        
        c).Método calcularIMC(): calculara si la persona está en su peso ideal 
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
        menor que 20, significa que la persona está por debajo de su peso ideal 
        y la función devuelve un -1. Si la fórmula da por resultado un número 
        entre 20 y 25 (incluidos), significa que la persona está en su peso ideal 
        y la función devuelve un 0. Finalmente, si el resultado de la fórmula es 
        un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
        función devuelve un 1.
        
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
        llamaremos todos los métodos para cada objeto, deberá comprobar si la 
        persona está en su peso ideal, tiene sobrepeso o está por debajo de su 
        peso ideal e indicar para cada objeto si la persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y 
        esMayorDeEdad en distintas variables(arrays), para después calcular un 
        porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas 
        en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje
        de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear 
        unos métodos adicionales.
        */
        
        boolean edades[] = new boolean[2];
        double pesoImc[] = new double[2];
        Persona[] vP = new Persona[2];

        PersonaServicio pS = new PersonaServicio();

        double pesoBajo = 0;
        double pesoIdeal = 0;
        double pesoExced = 0;
        int mayorEdad = 0;
        int menorEdad = 0;

        for (int i = 0; i < vP.length; i++) {

            vP[i] = pS.crearPersona();
            pesoImc[i] = pS.calcularIMC(vP[i]);
            edades[i] = pS.esMayorDeEdad(vP[i]);

            if (pesoImc[i] == (-1)) {
                pesoBajo++;
            } else if (pesoImc[i] == 0) {
                pesoIdeal++;
            } else {
                pesoExced++;
            }

            if (edades[i]) {
                mayorEdad++;
            } else {
                menorEdad++;
            }

        }

        System.out.println("Personas en su peso ideal: " + (pesoIdeal *100) /4 );
        System.out.println("Personas bajo de su peso ideal: " + (pesoBajo *100 ) / 4);
        System.out.println("Personas ensima de su peso ideal: " + (pesoExced *100) / 4);
        System.out.println("Personas mayores de edad: " + (mayorEdad *100) / 4);
        System.out.println("Personas menores de edad: " + (menorEdad *100) / 4);
        
    }

   
}
