/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Felino extends Mamifero {
    //Atributos
    private String tamaño;
    //Constructores

    public Felino() {
    }

    public Felino(String tamaño) {
        this.tamaño = tamaño;
    }

    public Felino(String tamaño, String tipoPelaje, int tiempoGestacion) {
        super(tipoPelaje, tiempoGestacion);
        this.tamaño = tamaño;
    }

    public Felino(String tamaño, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.tamaño = tamaño;
    }
    //Encapsulamiento

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    //Reglas de Negocio
    public void cazar(){
        System.out.println("Los animales felinos son cazadores por naturaleza");
    }
    public void trepar(){
        System.out.println("Los felinos son trepadores");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-FELINO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días\n" +
               "Tamaño: "+ getTamaño()+ "cm.";
    }
            
    
}
