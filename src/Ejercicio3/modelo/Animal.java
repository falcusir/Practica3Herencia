/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Animal {
    //Atributos
    private int id;
    private String nombre;
    private String edad;
    
    //Constructor
    public Animal (){
    }

    public Animal(int id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
   
    //Encapsulamiento

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    //Reglas de negocio
    
    public void comer(){
        System.out.println("Los animales se alimentan a dario");
    }
    
    public void dormir(){
        System.out.println("Los animales duermen en el dia o en la noche");
    }

    @Override
    public String toString() {
        return "\nDATOS DEL ANIMAL\n" +
               "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Edad: " + getEdad() + " años";
    }
    
    
    
    
}
