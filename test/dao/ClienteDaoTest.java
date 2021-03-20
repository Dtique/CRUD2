
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ClienteDaoTest {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    
    @org.junit.Test
    public void testConsultarClienteById() {
        System.out.println("consultarClienteById");
        int id = 0;
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteById(id);
        List result = instance.consultarClienteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class ClienteDao.
     */
    @org.junit.Test
    public void testConsultarClienteByNombre() {
        System.out.println("consultarClienteByNombre");
        String nombre = "";
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteByNombre(nombre);
        List result = instance.consultarClienteByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
