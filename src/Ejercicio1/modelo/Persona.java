
package Ejercicio1.modelo;


public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String direccion;
    private String horario;
    
    //MÉTODOS CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombre, String direccion, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    //MÉTODOS DE REGLA DE NEGOCIO
    
    public String asistir(){
        return "\n" + getNombre() + " asiste en el horario de " + getHorario();
                }
    @Override
    public String toString() {
        return "\n"+ "LOS DATOS DE LA PERSONA SON:\n"+
                "Nombre: "+getNombre()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Horario: "+getHorario();}
    
    }

