/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.modelo;

/**
 *
 * @author Dell Core i7
 */
public class PersonaDeporte {
    //Atributos    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
    //constructor

    public PersonaDeporte() {
    }

    public PersonaDeporte(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //Encapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Reglas de negocio
    
    public void concentrarse(){
        System.out.println("La concentración será en la noche");
    }
    public void viajar(){
        System.out.println("El equipo debe viajar a Cuenca ");
    }

    @Override
    public String toString() {
        return "\n Los datos del Miembro del Equipo de Fútbol son: \n" + 
                "ID: " + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" + 
                "Apellido: " + getApellidos() + "\n" +
                "Edad: " + getEdad()+ " años";

    }
    
    
    
}
