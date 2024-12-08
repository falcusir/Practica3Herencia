/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Entrenador extends PersonaDeporte{
    //Atributos
    private int idFederacion;
    
    //constructores
    public Entrenador(){
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    //Encapsulamiento

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    // Regla de Negocio
    public void dirigirPartido(){
        System.out.println("El partido fue dirigido con rigor");
    }
    public void dirigirEntrenamiento(){
        System.out.println("El entrenamiento es técnico y táctico");
    }

    @Override
    public String toString() {
        return "\nLos datos del ENTRENADOR son: \n" + 
                "ID de la Federación: "+ getIdFederacion()+ "\n" +
                "ID: " + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" + 
                "Apellidos: " + getApellidos() + "\n" +
                "Edad: " + getEdad() + " años";
    }
    
    
    
    
}
