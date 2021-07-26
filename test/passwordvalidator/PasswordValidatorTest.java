/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
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
     * Test of main method, of class PasswordValidator.
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of isValidPassword method, of class PasswordValidator.
     */
    @Test
    public void testIsValidPasswordGood1() {
        System.out.println("ValidPassword Good1");
        String pass = "Dieuhuynh@";
        boolean expResult = true;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsValidPasswordGood2() {
        System.out.println("ValidPassword Good2");
        String pass = "Sheridan!";
        boolean expResult = true;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsValidPasswordBad1() {
        System.out.println("InvalidPassword Bad1");
        String pass = "dieu";
        boolean expResult = false;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsValidPasswordBad2() {
        System.out.println("InvalidPassword Bad2");
        String pass = "Dieuhuynh";
        boolean expResult = false;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsValidPasswordBoundary1() {
        System.out.println("InvalidPassword Boundary1");
        String pass = " ";
        boolean expResult = false;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    @Test
    public void testIsValidPasswordBoundary2() {
        System.out.println("InvalidPassword Boundary2");
        String pass = "s";
        boolean expResult = false;
        boolean result = PasswordValidator.isValidPassword(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
