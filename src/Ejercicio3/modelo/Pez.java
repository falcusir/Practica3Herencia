/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Pez extends Oviparo{
    //Atributos
    private String especie;
    //Constructores    

    public Pez() {
    }

    public Pez(String especie) {
        this.especie = especie;
    }

    public Pez(String especie, int numHuevos, boolean tienePlumas, String habitat) {
        super(numHuevos, tienePlumas, habitat);
        this.especie = especie;
    }

    public Pez(String especie, int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(numHuevos, tienePlumas, habitat, id, nombre, edad);
        this.especie = especie;
    }
    //Encapsulamiento

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    //Reglas de negocio
    public void nadar(){
        System.out.println("Los peces para poder vivir deben nadar en el agua");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL OVÍPARO-REZ\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Número de Huevos " + getNumHuevos()+ "\n" + 
               "Tiene Plumas: " + getTienePlumas()+ "\n" +
               "Habitat: " + getHabitat()+ "\n" +
               "Especie: "+ getEspecie();
    }
    
}
