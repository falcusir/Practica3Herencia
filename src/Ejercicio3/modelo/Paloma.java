/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Paloma extends Ave{
    //Atributos
    private String color;
    //Constructores

    public Paloma() {
    }

    public Paloma(String color) {
        this.color = color;
    }

    public Paloma(String color, double envergadura) {
        super(envergadura);
        this.color = color;
    }

    public Paloma(String color, double envergadura, int numHuevos, boolean tienePlumas, String habitat) {
        super(envergadura, numHuevos, tienePlumas, habitat);
        this.color = color;
    }

    public Paloma(String color, double envergadura, int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(envergadura, numHuevos, tienePlumas, habitat, id, nombre, edad);
        this.color = color;
    }
    //Encapsulamiento

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Reglas de negocio
    public void anidar(){
        System.out.println("Los nidos de las palomas son pequeños");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL OVÍPARO-AVE-PALOMA\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Número de Huevos " + getNumHuevos()+ "\n" + 
               "Tiene Plumas: " + getTienePlumas()+ "\n" +
               "Habitat: " + getHabitat()+ "\n" +
               "Envergadura: "+ getEnvergadura()+" cm.\n" +
               "Color: " + getColor();
    }
    
    
}
