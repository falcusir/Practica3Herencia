
package Ejercicio1.modelo;


public class Administrador extends Empleado{
    //ATRIBUTOS
    private String puesto;
    //CONSTRUCTOR
    
       public Administrador() {
    }

    public Administrador(String puesto) {
        this.puesto = puesto;
    }

    public Administrador(String puesto, String jefe) {
        super(jefe);
        this.puesto = puesto;
    }

    public Administrador(String puesto, String jefe, String nombre, String direccion, String horario) {
        super(jefe, nombre, direccion, horario);
        this.puesto = puesto;
    }
    
    //ENCAPSULAMIENTO
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
       //REGLAS DE NEGOCIO

    public void administrar(){
        System.out.println("Está administrando bajo el cargo de "+ getPuesto());
    }
    
    @Override
    public String toString() {
        return  "\n" + "LOS DATOS DEL ADMINISTRADOR SON:\n"
                + "Nombre: " + getNombre() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Horario: " + getHorario() + "\n"
                + "Jefe: " + getJefe()+ "\n"
                + "Puesto: " + getPuesto();
                
    }
    
    
    
}
