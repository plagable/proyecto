
package com.unrc.app;
    
import org.junit.Test;
  import static org.junit.Assert.*;
  import com.unrc.app.Dueño;
import com.unrc.app.models.Owner;
  import org.javalite.activejdbc.Model;
import static org.javalite.activejdbc.Model.exists;

public class DueñoTest extends Model {
    
    // valores de prueba
    private String name = "pato";
    private String ape = "laga";
    private String localidad = "rio 4";
    private String tel = "154022732";
    private String barrio = "centro";
    private String calle = "belgrano 56";
    private String email = "jsjjs@hotmail.com";
     
     Dueño obteneid = new Dueño(); 
     Dueño expected = new Dueño();
          
     @Test  
    public void testInsertar () {        
     // obteneid.insertar(name,ape,localidad,tel,barrio,calle,email);
      //int id = expected.getId(); 
      //assertEquals(obteneid, exists(id));
      //exists(id)
      //assertTrue("tiene que decir si quedaron los 2",obteneid.equals(expected));
    }
    @Test
    public void testBaja () {
        Dueño duebaja =  new Dueño();  
        int id = duebaja.getId();
        duebaja.eliminar(id);       
        assertTrue(duebaja.equals(duebaja.getId()));
     
       //if !exists(id) {
         // assertEquals(duebaja, );   
        }          
        
    }
    
    