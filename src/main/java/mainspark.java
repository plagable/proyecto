import static spark.Spark.*;

import spark.*;
import spark.Route;
public class mainspark {

   public static void main(String[] args) {

      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });

   }

}
