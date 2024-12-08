/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Aguila extends Ave{
    //Atributos
    private String pico;
    private String garras;
    //Constructores

    public Aguila() {
    }

    public Aguila(String pico, String garras) {
        this.pico = pico;
        this.garras = garras;
    }

    public Aguila(String pico, String garras, double envergadura) {
        super(envergadura);
        this.pico = pico;
        this.garras = garras;
    }

    public Aguila(String pico, String garras, double envergadura, int numHuevos, boolean tienePlumas, String habitat) {
        super(envergadura, numHuevos, tienePlumas, habitat);
        this.pico = pico;
        this.garras = garras;
    }

    public Aguila(String pico, String garras, double envergadura, int numHuevos, boolean tienePlumas, String habitat, int id, String nombre, String edad) {
        super(envergadura, numHuevos, tienePlumas, habitat, id, nombre, edad);
        this.pico = pico;
        this.garras = garras;
    }
    //Encapsulamiento

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }
    //Reglas de negocio
    public void cazar(){
        System.out.println("Las águilas con buenas cazadoras"); 
   }

    @Override
    public String toString() {
        return "\nDATOS DEL OVÍPARO-AVE-ÁGUILA\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Número de Huevos " + getNumHuevos()+ "\n" + 
               "Tiene Plumas: " + getTienePlumas()+ "\n" +
               "Habitat: " + getHabitat()+ "\n" +
               "Envergadura: "+ getEnvergadura()+ " cm.\n" +
               "Pico: " + getPico()+ "\n" +
               "Garras: " + getGarras();
    }
    
}
