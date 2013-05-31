
import com.unrc.app.models.Owner;
import spark.*;
import static spark.Spark.*;


public class mainspark {

    public static void main(String[] args) {

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                Owner todosLosOwner = Owner.findFirst("first_name=pato");
                return "Hello World!";       
            }
        });

        get(new Route("/owners") {
            @Override
            public Object handle(Request request, Response response) {
                 String aux= "";
                 Owner todosLosOwner = Owner.findById(1);
                 
//                 for (Owner o: ob) {
//                     aux.concat(o.toString());
//                 }
                 //return aux;
                 return "hola";
             }
             
            });
     
}
}
