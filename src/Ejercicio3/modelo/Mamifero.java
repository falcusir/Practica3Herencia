/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Mamifero extends Animal{
    //Atributos
    private String tipoPelaje;
    private int tiempoGestacion;
    
    //Constructores

    public Mamifero() {
    }

    public Mamifero(String tipoPelaje, int tiempoGestacion) {
        this.tipoPelaje = tipoPelaje;
        this.tiempoGestacion = tiempoGestacion;
    }

    public Mamifero(String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(id, nombre, edad);
        this.tipoPelaje = tipoPelaje;
        this.tiempoGestacion = tiempoGestacion;
    }
    
    // Encapsulamiento

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public int getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(int tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

   //Reglas de Negocio
    public void amamantar(){
        System.out.println("Los mamíferos amamantan a sus crías");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días";
    }
    
    
}
