/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuHeros;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sagar
 */
public class HerosMerNGTest {
    
    public HerosMerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class HerosMer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HerosMer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculePuissance method, of class HerosMer.
     */
    @Test
    public void testCalculePuissance() {
        System.out.println("calculePuissance");
        HerosMer instance = null;
        double expResult = 0.0;
        double result = instance.calculePuissance();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of combat method, of class HerosMer.
     */
    @Test
    public void testCombat() throws Exception {
        System.out.println("combat");
        Heros herosDefense = null;
        HerosMer instance = null;
        instance.combat(herosDefense);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
