package com.unrc.app;

import com.unrc.app.models.*;

import org.javalite.activejdbc.Base;
import static spark.Spark.*;

import spark.*;
import spark.Route;
public class Inmo {
    public static void main( String[] args )
    {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root","");
         get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
        });
        
        
  // prueba de un nuevo usuario
   User e = new User();
        e.set("email", "user@email.com");
        e.set("first_name", "ariel");
        e.set("last_name", "Doe");
        //e.set("rol","USR");
        e.saveIt();
        
  // prueba de dueño
   Dueño d = new Dueño();
   d.insertar("cooo","rodriguez","Cordoba","154022732","centro","velez 7878","corodriguez@hotmail.com");
   d.eliminar(1);
   d.modificar(78,"last_name","jorge");

  // // prueba de inmobiliaria
   Inmobiliaria i=new Inmobiliaria();

  i.insertar("gutierrez Inmobiliaria","Cordoba","banda norte","bolivia 52",154022732, "gut@hotmail.com","www.gutierrez.com",2);
  i.eliminar(4);
  i.modificar(2,"first_name","jorge");


//prueba dueño inmueble e inmueble

DueñoInmueble di = new DueñoInmueble();

 di.insertar("dario","galicia","entre rios","154220674","centro","dds","dariog@hotmail.com",1);
// di.eliminar(1);
// di.modificar(3,"last_name","jorge");

Inmueble inm = new Inmueble();
//si se desea agregar un tipo diferente del enum creado lanza error
inm.insertar("Cordoba","bn"," barro 78","bueno",45,2,1,3);

// inm.insertar("a","b","c","d",8,"f","g",2);
//inm.eliminar(1);
//inm.modificar(3,"last_name","jorge");



        System.out.println( "Hello World!" );
    }
 }