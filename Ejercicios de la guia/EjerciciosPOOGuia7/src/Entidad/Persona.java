
package Entidad;

public class Persona {
    //para la clase private, se utiliza get y set para llamar los atributos del objeto en el clase main
    private String nombre;
    private int edad;
    private double estatura;
    
// contructor se lo llama de la clase main
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
}

