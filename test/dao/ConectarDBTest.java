/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Diego T
 */
public class ConectarDBTest {
    
    public ConectarDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class ConectarDB.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ConectarDB instance = new ConectarDB();
        DriverManagerDataSource expResult = instance.conectar();
        DriverManagerDataSource result = instance.conectar();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
