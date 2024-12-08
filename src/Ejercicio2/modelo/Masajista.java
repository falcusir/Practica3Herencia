/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Masajista extends PersonaDeporte{
    //Atributos
    private String titulacion;
    private int aniosExperiencia;
    
    //Constructores
    public Masajista(){
    }

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //Encapsulamiento

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //Reglas de Negocio
    
    public void darMasaje(){
        System.out.println("Los masajes relajan el músculo antes de cada partido");
    }

    @Override
    public String toString() {
         return "\nLos datos del MASAJISTA son: \n" + 
                "Nombre: " + getNombre() + "\n" + 
                "Apellidos: " + getApellidos() + "\n" +
                "Edad: " + getEdad() + " años" + "\n" + 
                "Título: " + getTitulacion() + "\n" + 
                "Años de Experiencia: " + getAniosExperiencia() + " años";
    }
    
    
}
