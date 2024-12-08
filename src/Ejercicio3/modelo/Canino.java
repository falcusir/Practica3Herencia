/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Canino extends Mamifero{
    //Atributos
    private String tipOrejas;
    
    //Constructores
    public Canino() {
    }

    public Canino(String tipOrejas) {
        this.tipOrejas = tipOrejas;
    }

    public Canino(String tipOrejas, String tipoPelaje, int tiempoGestacion) {
        super(tipoPelaje, tiempoGestacion);
        this.tipOrejas = tipOrejas;
    }

    public Canino(String tipOrejas, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.tipOrejas = tipOrejas;
    }
    
    //Encapsulamiento
    public String getTipOrejas() {
        return tipOrejas;
    }

    public void setTipOrejas(String tipOrejas) {
        this.tipOrejas = tipOrejas;
    }
    
    //Reglas de Negocio
    public void olfatear(){
        System.out.println("Los animales mamíferos que son caninos tienen buen olfato");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-CANINO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días" +"\n" +
               "Tipo de Orejas: " + getTipOrejas();
    }
    
    
    
    
}
