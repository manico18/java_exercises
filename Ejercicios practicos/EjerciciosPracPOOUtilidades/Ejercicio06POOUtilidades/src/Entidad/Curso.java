
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MATIAS
 */
public class Curso {
    
    private String nombreCurso;
    private int cantidadDeHorasPorDia;
    private int cantidadDeDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String [] alumnos = new String[5];

    public Curso() {
    }
    Scanner sca = new Scanner(System.in).useDelimiter("\n");
    public Curso(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno, double precioPorHora, String [] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadDeHorasPorDia() {
        return cantidadDeHorasPorDia;
    }

    public int getCantidadDeDiasPorSemana() {
        return cantidadDeDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
    }

    public void setCantidadDeDiasPorSemana(int cantidadDeDiasPorSemana) {
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        
    for (int i = 0; i < alumnos.length; i++) {
            
            System.out.print("Ingrese el nombre del alumno " + (i+1) + " :");
            alumnos[i] = sca.next();
        }
      
    }
    
    public void cargarCurso(){
        
        do {
           System.out.println("Ingrese turno del curso: ");
           turno = sca.next(); 
           System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
           if(!turno.equalsIgnoreCase("tarde") && !turno.equalsIgnoreCase("noche")){
               System.out.println("Error de ingreso, vuelva a intentarlo.");
               System.out.println("======================================");
           }
        } while (!turno.equalsIgnoreCase("tarde") && !turno.equalsIgnoreCase("noche"));
        
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = sca.next();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        
        System.out.print("Ingrese cuantos dias a la semana que se dicta el curso: ");
        cantidadDeDiasPorSemana = sca.nextInt();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.print("Ingrese la cantidad de horas por dia de cursada: ");
        cantidadDeHorasPorDia = sca.nextInt();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = sca.nextDouble();
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
        
        cargarAlumnos();
        
    }

    public void calcularGananciasSemana1 (){
        
        
        double gananSema = cantidadDeHorasPorDia * precioPorHora * alumnos.length * cantidadDeDiasPorSemana;
        
        System.out.println("La ganancia por semana, por curso " + nombreCurso + " es: " + gananSema + "$");
    
}
    
}
