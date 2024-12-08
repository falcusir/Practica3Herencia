
package Ejercicio1.modelo;


public class Empleado extends Persona {
    //ATRIBUTOS
    private String jefe;
    
    //CONSTRUCTORES
    public Empleado() {
    }

    public Empleado(String jefe) {
        this.jefe = jefe;
    }

    public Empleado(String jefe, String nombre, String direccion, String horario) {
        super(nombre, direccion, horario);
        this.jefe = jefe;
    }
    
    //ENCAPSULAMIENTO
    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
    // REGLAS DE NEGOCIO
    public String cobrar() {
        return "El Sueldo que cobra es: 500";

    }

    @Override
    public String toString() {
        return "\n" + "LOS DATOS DEL EMPLEADO SON:\n"
                + "Nombre: " + getNombre() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Horario: " + getHorario() + "\n"
                + "Su jefe es: " + getJefe();
    }

}
