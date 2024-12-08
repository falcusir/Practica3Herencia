/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Trucha extends Pez{
    //Atributos
    private String dieta;
    //Constructores

    public Trucha() {
    }

    public Trucha(String dieta) {
        this.dieta = dieta;
    }

    public Trucha(String dieta, String especie) {
        super(especie);
        this.dieta = dieta;
    }

    public Trucha(String dieta, String especie, int numHuevos, boolean tienePlumas, String habitat) {
        super(especie, numHuevos, tienePlumas, habitat);
        this.dieta = dieta;
    }

    public Trucha(String dieta, String especie, int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(especie, numHuevos, tienePlumas, habitat, id, nombre, edad);
        this.dieta = dieta;
    }
    
    //Encapsulamiento

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    //Reglas de Negocio
    public void saltar(){
        System.out.println("Las truchas saltan cosntantemente en el agua");
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
               "Especie: "+ getEspecie()+ "\n" +
               "Dieta: " + getDieta();
    }
    
    
}
