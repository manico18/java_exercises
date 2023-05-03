
package ejercicio01pooutilidades;


import Servicio.ServicioCadena;

/**
 *
 * @author MATIAS
 */
public class Ejercicio01POOUtilidades {

    public static void main(String[] args) {
        /*
        Realizar una clase llamada Cadena, en el paquete de entidades, que tenga 
        como atributos una frase (String) y su longitud. Agregar constructor vacío 
        y con atributo frase solamente. Agregar getters y setters. El constructor 
        con frase como atributo debe setear la longitud de la frase de manera 
        automática. Crear una clase CadenaServicio en el paquete servicios que 
        implemente los siguientes métodos:
        
        a)-Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
        que tiene la frase ingresada.
        
        b)-Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
        por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        
        c)-Método vecesRepetido(String letra), recibirá un carácter ingresado por
        el usuario y contabilizar cuántas veces se repite el carácter en la frase.
        
        d)-Método compararLongitud(String frase), deberá comparar la longitud de 
        la frase que compone la clase con otra nueva frase ingresada por el usuario.
        
        e)-Método unirFrases(String frase), deberá unir la frase contenida en la 
        clase Cadena con una nueva frase ingresada por el usuario y mostrar la 
        frase resultante.
        
        f)-Método reemplazar(String letra), deberá reemplazar todas las letras 
        “a” que se encuentren en la frase, por algún otro carácter seleccionado 
        por el usuario y mostrar la frase resultante.
        
        g)-Método contiene(String letra), deberá comprobar si la frase contiene 
        una letra que ingresa el usuario y devuelve verdadero si la contiene y 
        falso si no.
        */
        
        ServicioCadena f = new ServicioCadena();
        
        f.mostrarVocales();
        f.invertirFrase();
        f.vecesRepetido();
        f.compararLongitud();
        f.unirFrases();
        f.reemplazar();
        f.contiene();
    }

}
