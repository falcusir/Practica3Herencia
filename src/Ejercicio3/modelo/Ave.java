/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Ave extends Oviparo{
    //Atributos
    private double envergadura;
    //Constructores

    public Ave() {
    }

    public Ave(double envergadura) {
        this.envergadura = envergadura;
    }

    public Ave(double envergadura, int numHuevos, boolean tienePlumas, String habitat) {
        super(numHuevos, tienePlumas, habitat);
        this.envergadura = envergadura;
    }

    public Ave(double envergadura, int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(numHuevos, tienePlumas, habitat, id, nombre, edad);
        this.envergadura = envergadura;
    }
    //Encapsulamiento

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
    //Reglas de negocio
    public void volar(){
        System.out.println("La mayoria de aves vuelan");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL OVÍPARO-AVE\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Número de Huevos " + getNumHuevos()+ "\n" + 
               "Tiene Plumas: " + getTienePlumas()+ "\n" +
               "Habitat: " + getHabitat()+ "\n" +
               "Envergadura: "+ getEnvergadura()+ " cm.";
    }
    
    
}
