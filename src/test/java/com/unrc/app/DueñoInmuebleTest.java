
package com.unrc.app;
    
import org.junit.Test;
  import static org.junit.Assert.*;
  import com.unrc.app.*;
  import org.javalite.activejdbc.Model;

public class DueñoInmuebleTest  {
    
    // valores de prueba
    private String name = "pato";
    private String ape = "laga";
    private String localidad = "rio 4";
    private String tel = "154022732";
    private String barrio = "centro";
    private String calle = "belgrano 56";
    private String email = "jsjjs@hotmail.com";
     
   //  Dueño expected = Dueño.getId(); // el get dle model 
    // Dueño obteneid = new Dueño(); 
     
     @Test  
    public void testInsertar () {                  
       
      //assertEquals(expected,obteneid.insertar(name,ape,localidad,tel,barrio,calle,email);
      //exists();
      //assertTrue("tiene que decir si quedaron los 2",obteneid.equals(expected));
      
    }
    @Test
    public void testBaja () {
        Dueño duebaja =  new Dueño();  
        duebaja.eliminar(1);       
        assertTrue(duebaja.equals(duebaja.getId()));
		
    }
    
    @Test
    public void testModi () {
       
  
    }
}   