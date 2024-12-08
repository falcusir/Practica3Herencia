/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Gato extends Felino {
    //Atributos
    private String color;
    //COnstructores

    public Gato() {
    }

    public Gato(String color) {
        this.color = color;
    }

    public Gato(String color, String tamaño) {
        super(tamaño);
        this.color = color;
    }

    public Gato(String color, String tamaño, String tipoPelaje, int tiempoGestacion) {
        super(tamaño, tipoPelaje, tiempoGestacion);
        this.color = color;
    }

    public Gato(String color, String tamaño, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tamaño, tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.color = color;
    }
    //Encapsulamiento

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Reglas de Negocio
    public void ronronear(){
        System.out.println("El ronroneo de los gatos tienen beneficios para la salud humana");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-FELINO-GATO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días\n" +
               "Tamaño: "+ getTamaño()+ "cm."+
               "Color: "+ getColor();
    }
    
    
}
