/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego T
 */
public class ClienteDaoTest {
    
    public ClienteDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicio test principal.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin test principal.");
    }
    
    @Before
    public void setUp() {
        System.out.println("Inicia test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finaliza test");
    }

    /**
     * Test of consultarClienteById method, of class ClienteDao.
     */
    @Test
    public void testConsultarClienteById() {
        System.out.println("consultarClienteById");
        int id = 0;
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteById(id);
        List result = instance.consultarClienteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class ClienteDao.
     */
    @Test
    public void testConsultarClienteByNombre() {
        System.out.println("consultarClienteByNombre");
        String nombre = "";
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteByNombre(nombre);
        List result = instance.consultarClienteByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class ClienteDao.
     */
    @Test
    public void testMostrarCliente() {
        System.out.println("mostrarCliente");
        ClienteDao instance = new ClienteDao();
        List expResult = instance.mostrarCliente();
        List result = instance.mostrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientesbyId method, of class ClienteDao.
     */
    @Test
    public void testCargarClientesbyId() {
        System.out.println("cargarClientesbyId");
        int id = 0;
        ClienteDao instance = new ClienteDao();
        List expResult = instance.cargarClientesbyId(id);
        List result = instance.cargarClientesbyId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
