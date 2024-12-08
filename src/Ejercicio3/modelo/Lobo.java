/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Lobo extends Canino{
    //Atributos
    private String habitat;
    //Constructores

    public Lobo() {
    }

    public Lobo(String habitat) {
        this.habitat = habitat;
    }

    public Lobo(String habitat, String tipOrejas) {
        super(tipOrejas);
        this.habitat = habitat;
    }

    public Lobo(String habitat, String tipOrejas, String tipoPelaje, int tiempoGestacion) {
        super(tipOrejas, tipoPelaje, tiempoGestacion);
        this.habitat = habitat;
    }

    public Lobo(String habitat, String tipOrejas, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tipOrejas, tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.habitat = habitat;
    }
    //Encapsulamiento

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    //Reglas de negocio
    public void aullar(){
        System.out.println("Los lobos aullan a la luna");        
    }
    public void cazar(){
        System.out.println("Los son cazadores por naturaleza");        
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-CANINO-LOBO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días\n" +
               "Tipo de Orejas: " + getTipOrejas()+ "\n"+
               "Hábitat: " + getHabitat();
    }
    
}
