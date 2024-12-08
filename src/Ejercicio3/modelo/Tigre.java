/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Tigre extends Felino{
    //Atributos
    private String rayas;
    //constructores

    public Tigre() {
    }

    public Tigre(String rayas) {
        this.rayas = rayas;
    }

    public Tigre(String rayas, String tamaño) {
        super(tamaño);
        this.rayas = rayas;
    }

    public Tigre(String rayas, String tamaño, String tipoPelaje, int tiempoGestacion) {
        super(tamaño, tipoPelaje, tiempoGestacion);
        this.rayas = rayas;
    }

    public Tigre(String rayas, String tamaño, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tamaño, tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.rayas = rayas;
    }
    //Encapsulamiento

    public String getRayas() {
        return rayas;
    }

    public void setRayas(String rayas) {
        this.rayas = rayas;
    }
    //Reglas de Negocio
    public void nadar(){
        System.out.println("Los Tigres son excelentes nadadores");
    }
    public void rugir(){
        System.out.println("Los tigres rugen fuertemente");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-FELINO-TIGRE\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días\n" +
               "Tamaño: "+ getTamaño()+ "cm."+"\n" +
               "Tipo de rayas: "+ getRayas();
    }
    
    
}
