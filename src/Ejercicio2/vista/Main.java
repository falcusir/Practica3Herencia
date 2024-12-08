/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.vista;

import Ejercicio2.modelo.Entrenador;
import Ejercicio2.modelo.Futbolista;
import Ejercicio2.modelo.Masajista;
import Ejercicio2.modelo.PersonaDeporte;



/**
 *
 * @author Dell Core i7
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciar un objeto de tipo PersonaDeporte    
        PersonaDeporte pd1= new PersonaDeporte(01,"Ulises","De la Cruz",43);
        PersonaDeporte pd2= new PersonaDeporte(02, "Pepito", "Flores", 28);
        PersonaDeporte pd3= new PersonaDeporte(03, "Bryan", "Olmedo", 29);
        PersonaDeporte pd4= new PersonaDeporte(04, "Patricio", "Urrutia", 25);
        //System.out.println(pd1.toString());
        //pd1.concentrarse();
        //pd1.viajar();

        //Instanciar un objeto de tipo Futbolista
        Futbolista f1 = new Futbolista(56,"Marcador Derecho",pd1.getId(),pd1.getNombre(),pd1.getApellidos(),pd1.getEdad());
        System.out.println(f1.toString());
        f1.entrenar();
        f1.concentrarse();
        f1.viajar();
        f1.jugarPartido();

        //Instanciar un objeto de tipo Entrenador
        Entrenador e1= new Entrenador(10, pd2.getId(), pd2.getNombre(),pd2.getApellidos(),pd2.getEdad());
        System.out.println(e1.toString());
        e1.dirigirEntrenamiento();
        e1.dirigirPartido();

        //Instanciar un objeto de tipo Masajista
        Masajista m1 = new Masajista("Fisioterapista", 8, 0, pd3.getNombre(), pd3.getApellidos(), pd3.getEdad());
        System.out.println(m1.toString());
        m1.darMasaje();
    
    
    
    }
   
    
    
    
    
}
