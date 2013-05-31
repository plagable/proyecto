package com.unrc.app;

import com.unrc.app.models.Owner;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.LazyList;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * ============== BUSCAR
 *
 * 1) List<Person> people = Person.where("name = 'John'");
 *
 * 2) Person aJohn = people.get(0);
 *
 * 3) String johnsLastName = aJohn.get("last_name");
 *
 * ============== INSERTAR
 *
 * Person.createIt("name", "Marilyn", "last_name", "Monroe", "dob",
 * "1935-12-06");
 *
 * ============== ACTUALIZAR
 *
 *
 * Employee e = Employee.findFirst("first_name = ?", "John");
 *
 * e.set("last_name", "Steinbeck").saveIt();
 *
 * ============== BORRAR
 *
 * Employee e = Employee.findFirst("first_name = ?", "John");
 *
 * e.delete();
 *
 *
 * @author Patricia
 */
public class DueñoTest1 {

    // @BeforeClass
    // public void beforeClass() {
    //   Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "");
    //}
//    @AfterClass
//    public void afterClass() {
//       
//        Base.close();
//    }
    @Before
    public void beforeTest() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "");
        Base.openTransaction();
    }

    @After
    public void afterTest() {
        Base.rollbackTransaction();
        Base.close();
    }

    @Test
    public void testInsertar1() {
        System.out.println("insertar 1");
        String first_name = "pato";
        String last_name = "lagable";
        String city = "rio cuarto";
        int phone_number = 1251611321;
        String neighborhood = "barrio universidad";
        String street = "colon 612";
        String email = "casa@gmail.com";

        //insertar con ajdb
        Owner.createIt(first_name, last_name, city, phone_number, neighborhood, street, email);

        Dueño.insertar(first_name, last_name, city, phone_number, neighborhood, street, email);
        //busca TODOS los OWNER que coincidan
        LazyList<Owner> encontrados = Owner.where(
                "first_name = '" + first_name + "' and "
                + "last_name = '" + last_name + "' and "
                + "city = '" + city + "' and "
                + "phone_number = '" + phone_number + "' and "
                + "neighborhood = '" + neighborhood + "' and "
                + "street = '" + street + "' and "
                + "email = '" + email + "'");

        assertTrue(encontrados.size() == 1);
    }

    @Test
    public void testInsertar2() {
        System.out.println("insertar 2");
        String first_name = "pat";
        String last_name = "bonnettttt";
        String city = " ";
        int phone_number = 1251 * 611321;
        String neighborhood = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        String street = "colon 612";
        String email = "casagmail.com";

        //insertar con ajdb
        Owner.createIt(first_name, last_name, city, phone_number, neighborhood, street, email);

        //  Dueño.insertar(first_name, last_name, city, phone_number, neighborhood, street, email);
        //busca TODOS los OWNER que coincidan
        LazyList<Owner> encontrados = Owner.where(
                "first_name = '" + first_name + "' and "
                + "last_name = '" + last_name + "' and "
                + "city = '" + city + "' and "
                + "phone_number = '" + phone_number + "' and "
                + "neighborhood = '" + neighborhood + "' and "
                + "street = '" + street + "' and "
                + "email = '" + email + "'");

        assertTrue(encontrados.size() == 1);
    }

    @Test
    public void testInsertar3() {
        System.out.println("insertar 3");
        String first_name = "puedo tener un nombre asi: _:lslsls**//8 ";
        String last_name = "bonnet";
        String city = "laboulaie ";
        int phone_number = 1251611001;
        String neighborhood = " ";
        String street = "colon 612";
        String email = "casagmail.com";

        //insertar con ajdb
        Owner.createIt(first_name, last_name, city, phone_number, neighborhood, street, email);

        //  Dueño.insertar(first_name, last_name, city, phone_number, neighborhood, street, email);
        //busca TODOS los OWNER que coincidan
        LazyList<Owner> encontrados = Owner.where(
                "first_name = '" + first_name + "' and "
                + "last_name = '" + last_name + "' and "
                + "city = '" + city + "' and "
                + "phone_number = '" + phone_number + "' and "
                + "neighborhood = '" + neighborhood + "' and "
                + "street = '" + street + "' and "
                + "email = '" + email + "'");

        assertTrue(encontrados.size() == 1);
    }

    /**
     * Test of eliminar method, of class Dueño.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar 1");

        String first_name = "pato";
        String last_name = "lagable";
        String city = "rio cuarto";
        int phone_number = 1251611321;
        String neighborhood = "barrio centro";
        String street = "colon 612";
        String email = "lapato@gmail.com";

        Owner.createIt("eli", "dom", "rio cuarto", 6298422, "centro 1", "colon 612", "elido@gmail.com");
        Owner.createIt("mati", "alvarez", "buenos aires", 151155, "la boca", "casilda 1551", "malvarez@hotamil.com");
        Owner.createIt(first_name, last_name, city, phone_number, neighborhood, street, email);

        Owner encontrado = Owner.findFirst(
                "first_name = '" + first_name + "' and "
                + "last_name = '" + last_name + "' and "
                + "city = '" + city + "' and "
                + "phone_number = '" + phone_number + "' and "
                + "neighborhood = '" + neighborhood + "' and "
                + "street = '" + street + "' and "
                + "email = '" + email + "'");

        if (encontrado == null) {
            fail("Error: No se encontro pato para borrar");
        } else {
            Integer id = encontrado.getInteger("id");
            encontrado.deleteCascade();
            LazyList<Owner> todosLosOwner = Owner.findAll();

            for (Owner o : todosLosOwner) {
                assertFalse(
                        id == o.getInteger("id")
                        && first_name.equals(o.getString("first_name"))
                        && last_name.equals(o.getString("last_name"))
                        && city.equals(o.getString("city"))
                        && phone_number == o.getInteger("phone_number")
                        && neighborhood.equals(o.getString("neighborhood"))
                        && street.equals(o.getString("street"))
                        && email.equals(o.getString("email")));
            }
        }

    }
//    /**
//     * Test of modificar method, of class Dueño.
//     */
//    @Test
//    public void testModificar() {
//        System.out.println("modificar");
//        int id = 0;
//        String element = "";
//        String change = "";
//        Dueño.modificar(id, element, change);
//        // falta hacer es un ejemplo
//
//
//        fail("The test case is a prototype.");
//
//    }
}
