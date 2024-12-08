/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Perro extends Canino {
    //Atributos
    private String color;
    private String raza;
    //Constructores

    public Perro() {
    }

    public Perro(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String tipOrejas) {
        super(tipOrejas);
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String tipOrejas, String tipoPelaje, int tiempoGestacion) {
        super(tipOrejas, tipoPelaje, tiempoGestacion);
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String tipOrejas, String tipoPelaje, int tiempoGestacion, int id, String nombre, String edad) {
        super(tipOrejas, tipoPelaje, tiempoGestacion, id, nombre, edad);
        this.color = color;
        this.raza = raza;
    }
    //Encapsulamiento

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Regla de negocio
    public void ladrar(){
        System.out.println("Los perros ladran por naturaleza");   
    }
    public void jugar(){
        System.out.println("Los perros son juguetones con sus dueños");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL MAMÍFERO-CANINO-PERRO\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años" + "\n" +
               "Tipo de Pelaje: " + getTipoPelaje()+ "\n" + 
               "Tiempo de Gestación: " + getTiempoGestacion()+ " días" +"\n" +
               "Tipo de Orejas: " + getTipOrejas()+"\n" +
               "Color: " + getColor()+ "\n" +
               "Raza: " + getRaza();
    }
    
    

}
