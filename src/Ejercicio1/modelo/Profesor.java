
package Ejercicio1.modelo;

public class Profesor extends Empleado{
    //ATRIBUTOS
    private String carrera;
    
    //COSNTRUCTORES

    public Profesor() {
    }
    
    public Profesor(String carrera) {
        this.carrera = carrera;
    }

    public Profesor(String carrera, String jefe) {
        super(jefe);
        this.carrera = carrera;
    }

    public Profesor(String carrera, String jefe, String nombre, String direccion, String horario) {
        super(jefe, nombre, direccion, horario);
        this.carrera = carrera;
    }
    
    //ENCAPSULAMIENTO
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //REGLAS DE NEGOCIO
    
    public void enseñar(){
        System.out.println("Está enseñando en la carrera de "+ getCarrera());
        
    }
    
    
    @Override
    public String toString() {
        return "\n" + "LOS DATOS DEL PROFESOR SON:\n"
                + "Nombre: " + getNombre() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Horario: " + getHorario() + "\n"
                + "Jefe: " + getJefe() + "\n"
                + "Carrera: " + getCarrera();
    }
    

    
    
}
