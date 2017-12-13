/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuHeros;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sagar
 */
public class HerosTerreTest {
    
    public HerosTerreTest() {
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
     * Test of toString method, of class HerosTerre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HerosTerre instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculePuissance method, of class HerosTerre.
     */
    @Test
    public void testCalculePuissance() {
        System.out.println("calculePuissance");
        HerosTerre instance = null;
        double expResult = 0.0;
        double result = instance.calculePuissance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of combat method, of class HerosTerre.
     */
    @Test
    public void testCombat() throws Exception {
        System.out.println("combat");
        Heros herosDefense = null;
        HerosTerre instance = null;
        instance.combat(herosDefense);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
