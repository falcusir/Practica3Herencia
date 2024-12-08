package Ejercicio1.vista;

import Ejercicio1.modelo.Administrador;
import Ejercicio1.modelo.Empleado;
import Ejercicio1.modelo.Estudiante;
import Ejercicio1.modelo.Persona;
import Ejercicio1.modelo.Profesor;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Fernanda Alcusir", "Alpachaca", "8:00 am - 17:00 pm");
        System.out.println(p1.toString());
        System.out.println(p1.asistir());
        
        Empleado e1 = new Empleado("Carmen Díaz","Clarita Hernández","Los Ceibos", "8:00 am - 17:00 pm");
        System.out.println(e1.toString());
        System.out.println(e1.asistir());
        System.out.println(e1.cobrar());
        
        Estudiante es1=new Estudiante(3,"B", "Pablo Robles","Urcuqui","13:00 pm - 18:00 pm");
        System.out.println(es1.toString());
        System.out.println(es1.asistir());
        es1.estudiar();
        
        Administrador admin1= new Administrador("Coordinadora", "Anita Montenegro", "Gabriela Lanchimba", "Otavalo", "8:00am -12pm");
        System.out.println(admin1.toString());
        System.out.println(admin1.asistir());
        System.out.println(admin1.cobrar());
        admin1.administrar();
        
        Profesor prof1 = new Profesor("Desarrollo de Software", "Gabriela Valladares", "Armando Chávez", "Los Sauces", "8:00 a 10:00 - 15:00 a 18:00");
        System.out.println(prof1.toString());
        System.out.println(prof1.asistir());
        System.out.println(prof1.cobrar());
        prof1.enseñar();
        
     
    }
}
