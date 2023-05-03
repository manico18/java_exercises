package entidad;

import java.util.Scanner;

public class Libro {

    public int ICBN;
    public String titulo;
    public String autor;
    public int numDePag;

    public Libro() {
    }

    public Libro(int ICBN, String titulo, String autor, int numDePag) {
        this.ICBN = ICBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
    }
    
    public void carLibro(){
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el numero de ICBN: ");
        ICBN = sca.nextInt();
        System.out.println("=================================");
        System.out.print("Ingrese el titulo del libro: ");
        titulo = sca.next();
        System.out.println("=================================");
        System.out.print("Ingrese el autor del libro: ");
        autor = sca.next();
        System.out.println("=================================");
        System.out.print("Ingrese el numero de pagina del libro: ");
        numDePag = sca.nextInt();
        System.out.println("=================================");
    }

    
    
    
   
}
