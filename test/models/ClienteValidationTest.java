/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.Errors;

/**
 *
 * @author Diego T
 */
public class ClienteValidationTest {
    
    public ClienteValidationTest() {
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
     * Test of supports method, of class ClienteValidation.
     */
    @Test
    public void testSupports() {
        System.out.println("supports");
        Class type = null;
        ClienteValidation instance = new ClienteValidation();
        boolean expResult = false;
        //boolean result = instance.supports(type);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class ClienteValidation.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Object o = null;
        Errors errors = null;
        ClienteValidation instance = new ClienteValidation();
        //instance.validate(o, errors);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
