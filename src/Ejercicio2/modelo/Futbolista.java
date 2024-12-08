/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.modelo;

/**
 *
 * @author Dell Core i7
 */
public class Futbolista extends PersonaDeporte {
    //Atributos
    private int dorsal;
    private  String demarcacion;
    
    //Constructor
    public Futbolista(){
    
    }
    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    //Encapsulamiento

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    //reglas de negocio
    public void jugarPartido(){
        System.out.println("Se lesionó en el partido"); 
    }
    public void entrenar(){
        System.out.println("Tuvo un buen desempeño en la semana de entrenamiento ");
    }
    
    @Override
    public String toString() {
        return "\nLos datos del FUTBOLISTA son: \n" + 
                "ID: " + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" + 
                "Apellidos: " + getApellidos() + "\n" +
                "Edad: " + getEdad() + " años" + "\n" + 
                "Dorsal: " + getDorsal()+ " cm." + "\n" + 
                "Demarcación: " + getDemarcacion() ;
    }
    
    
    
}
