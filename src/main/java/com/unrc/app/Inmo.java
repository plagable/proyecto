package com.unrc.app;

import com.unrc.app.models.*;
import org.javalite.activejdbc.Base;


public class Inmo {

    public static void main(String[] args) {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "");
        
        User e = new User();
        User.createIt("email","pruebacreate@email.com","first_name","createpato","last_name","createñagable");
        
        e.set("email", "user@email.com");
        e.set("first_name", "ariel");
        e.set("last_name", "Doe");
        e.saveIt();
        // prueba de dueño   
        Dueño.insertar("cooo", "rodriguez", "Cordoba", 154022732, "centro", "velez 7878", "corodriguez@hotmail.com");
        
        Dueño.eliminar(1);
        Dueño.modificar(78, "last_name", "jorge");
        // prueba de inmobiliaria
        Inmobiliaria i = new Inmobiliaria();
        Inmobiliaria.insertar("gutierrez Inmobiliaria", "Cordoba", "banda norte", "bolivia 52", 154022732, "gut@hotmail.com", "www.gutierrez.com", 2);
        Inmobiliaria.eliminar(4);
        Inmobiliaria.modificar(2, "first_name", "jorge");
//prueba dueño inmueble e inmueble
        DueñoInmueble.insertar("dario", "galicia", "entre rios", "154220674", "centro", "dds", "dariog@hotmail.com", 1);
        DueñoInmueble.eliminar(1);
        DueñoInmueble.modificar(3,"last_name","jorge");
//si se desea agregar un tipo diferente del enum creado lanza error
           
        Inmueble.insertar("Cordoba", "bandanorte", " brasil 78", "dep intero", 45, 2, 1, 3);
        Inmueble.modificar(3,"last_name","jorge");
        System.out.println("Hello World!");
        
    }
}