
package Ejercicio1.modelo;


public class Estudiante extends Persona{
    
    //ATRIBUTOS
    private int grado;
    private String grupo;
    //CONSTRUCTOR
    public Estudiante() {
    }

    public Estudiante(int grado, String grupo) {
        this.grado = grado;
        this.grupo = grupo;
    }

    public Estudiante(int grado, String grupo, String nombre, String direccion, String horario) {
        super(nombre, direccion, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    //ENCAPSULAMIENTO

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    //REGLAS DE NEGOCIO
    public void estudiar(){
            System.out.println("Estudia en el grado: "+ getGrado()+ " del grupo " + getGrupo());
    }
    @Override
    public String toString() {
        return "\n" + "LOS DATOS DEL ESTUDIANTE SON:\n"
                + "Nombre: " + getNombre() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Horario: " + getHorario() + "\n"
                + "Grado: " + getGrado()+ "\n"
                + "Grupo: "+ getGrupo();
    }
    
    
}