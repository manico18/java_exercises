package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class PeliculaServicio {

    private Scanner sca = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Pelicula> peliculas = new ArrayList();
    
    public void crearPelicula() {

        String resp;
        boolean ifsi = true;
        

        do {
            Pelicula pO = new Pelicula();

            System.out.print("Ingrese el titulo de la pelicula: ");
            pO.setTitulo(sca.next());
            System.out.println("========================================");
            System.out.print("Ingrese el director de la pelicula: ");
            pO.setDirector(sca.next());
            System.out.println("========================================");
            System.out.print("Ingrese la duracion de la pelicula: ");
            pO.setDuracion(sca.nextDouble());
            System.out.println("========================================");
            
            peliculas.add(pO);
            
            do {
               System.out.print("Desea agregar una pelicula mas: ");
               resp = sca.next();                
               System.out.println("========================================");
               
               if (resp.equalsIgnoreCase("si") && resp.equalsIgnoreCase("no")) {
               } else if (resp.equalsIgnoreCase("no")) {
                    ifsi = false;
                } else if (resp.equalsIgnoreCase("si")) {
                    ifsi = true;
                    break;
                } else {
                    System.out.println("La respuesta ingresada es incorrecta, vuelva a intentarlo");
                    System.out.println("=========================================================");
               }
            } while (ifsi);
         
        } while (resp.equalsIgnoreCase("si"));

    }
    
    public void mostrarPeliculas(){
      
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);          
        }
    }
    
    public void peliculasMasDeUnaHora(){
        
        System.out.println("======PELICULAS DE MAS DE 1 HORA======");
        for (Pelicula pelicula : peliculas) {
            
            if(pelicula.getDuracion()>=1){
                System.out.println(pelicula);
            }
        }  
    }
    
    public void peliculasDuracionMayorAMenor(){
        
       System.out.println("======DURACION DE PELICULA DE MAYOR A MENOR======"); 
       peliculas.sort(Pelicula.compararDuracion);   
       mostrarPeliculas(); 
    }
    
    public void peliculasDuracionMenorAMayor(){
        
       System.out.println("======DURACION DE PELICULA DE MENOR A MAYOR======"); 
       peliculas.sort(Pelicula.compararDuracion.reversed());   
       mostrarPeliculas(); 
    }
    
    public void peliculasAlfabeticamenteTitulo(){
        
        System.out.println("======PELICULAS ORDENADAS POR TITULO======");
        peliculas.sort(Pelicula.compararTitulo);   
        mostrarPeliculas();
    }
    
    public void peliculasAlfabeticamenteDirector(){
        
        System.out.println("======PELICULAS ORDENADAS POR DIRECTOR======");
        peliculas.sort(Pelicula.compararDirector);   
        mostrarPeliculas();
    }
}
