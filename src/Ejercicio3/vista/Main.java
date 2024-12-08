/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.vista;

import Ejercicio3.modelo.Aguila;
import Ejercicio3.modelo.Animal;
import Ejercicio3.modelo.Gato;
import Ejercicio3.modelo.Lobo;
import Ejercicio3.modelo.Paloma;
import Ejercicio3.modelo.Perro;
import Ejercicio3.modelo.Tigre;
import Ejercicio3.modelo.Trucha;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    public static void main(String[] args) {
       
        Animal a1 = new Animal(1, "Lazy", "3");
        Animal a2 = new Animal(1, "Drak", "6");
        Animal a3 = new Animal(1, "Mimí", "2");
        Animal a4 = new Animal(1, "Fortachon", "10");
        Animal a5 = new Animal(1, "Cascada", "1");
        Animal a6 = new Animal(1, "Solaris", "7");
        Animal a7 = new Animal(1, "Iris", "9");
        
        Perro p1 = new Perro("Blanco", "Labrador", "Redondeadas triangulares", "Doble, largo y resistente",58, a1.getId(), a1.getNombre(), a1.getEdad());
        System.out.println(p1.toString());
        p1.ladrar();
        p1.jugar();
        p1.olfatear();
        p1.amamantar();
        p1.comer();
        p1.dormir();
        
        Lobo l1 = new Lobo("Bosque", "Erectas y erguidas", "Doble, áspero y denso", 63, a2.getId(), a2.getNombre(), a2.getEdad());
        System.out.println(l1.toString());
        l1.aullar();
        l1.cazar();
        l1.olfatear();
        l1.amamantar();
        l1.comer();
        l1.dormir();
              
        Gato g1 = new Gato("Gris", "35", "Corto y suave", 65, a3.getId(), a3.getNombre(), a3.getEdad());
        System.out.println(g1.toString());
        g1.ronronear();
        g1.cazar();
        g1.trepar();
        g1.amamantar();
        g1.comer();
        g1.dormir();
        
        Tigre t1 = new Tigre("Claras", "150", "Corto y áspero", 93, a4.getId(), a4.getNombre(), a4.getEdad());
        System.out.println(t1.toString());
        t1.nadar();
        t1.rugir();
        t1.cazar();
        t1.trepar();
        t1.amamantar();
        t1.comer();
        t1.dormir();
        
        Trucha truch1= new Trucha("Insectos y crustáceos", "Trucha", 1000, false, "Ríos y arrollos", a3.getId(), a3.getNombre(), a3.getEdad());
        System.out.println(truch1.toString());
        truch1.saltar();
        truch1.nadar();
        truch1.ponerHuevo();
        truch1.incubarHuevo();
        truch1.comer();
        truch1.dormir();
        
        Aguila agui1= new Aguila("Curvado y afilado", "Grandes, curvadas y afiladas,", 1.8, 4, true, "Montañas y acantilados", a4.getId(), a4.getNombre(), a4.getEdad());
        System.out.println(agui1.toString());
        agui1.cazar();
        agui1.volar();
        agui1.ponerHuevo();
        agui1.incubarHuevo();
        agui1.comer();
        agui1.dormir();
        
        Paloma pal1= new Paloma("Blanca", 60, 2, true, "Áreas Urbanas", a5.getId(), a5.getNombre(), a5.getEdad());
        System.out.println(pal1.toString());
        pal1.anidar();
        pal1.volar();
        pal1.ponerHuevo();
        pal1.incubarHuevo();
        pal1.comer();
        pal1.dormir();
        
        System.out.println("\nRESUMEN");
        System.out.println("Todos los animales tienen en común las siguientes características:");
        a1.comer();
        a1.dormir();}
        
    
    
}
