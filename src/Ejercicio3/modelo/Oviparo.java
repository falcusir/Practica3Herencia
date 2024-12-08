/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Oviparo extends Animal {
    //Atributos
    private int numHuevos;
    private boolean tienePlumas;
    private String habitat;
    
    //Constructores
    public Oviparo() {
    }

    public Oviparo(int numHuevos, boolean tienePlumas, String habitat) {
        this.numHuevos = numHuevos;
        this.tienePlumas = tienePlumas;
        this.habitat = habitat;
    }

    public Oviparo(int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(id, nombre, edad);
        this.numHuevos = numHuevos;
        this.tienePlumas = tienePlumas;
        this.habitat = habitat;
    }
    
    //Encapsulamiento

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    public boolean getTienePlumas() {
        return tienePlumas;
    }

    public void setTienePlumas(boolean tienePlumas) {
        this.tienePlumas = tienePlumas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //Reglas de negocio
    public void ponerHuevo(){
        System.out.println("Los ovíparos se reproducen por huevos");
    }
    public void incubarHuevo(){
        System.out.println("Los oviparos incuban ");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL OVÍPARO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Número de Huevos " + getNumHuevos()+ "\n" + 
               "Tiene Plumas: " + getTienePlumas()+ "\n" +
               "Habitat: " + getHabitat();
    }
    
    
    
    
}
