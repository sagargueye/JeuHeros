/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JeuHeros.HerosFeu;
import JeuHeros.HerosMer;
import JeuHeros.HerosTerre;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author p1623082
 */
public class cas_ou_ça_plante {

    public cas_ou_ça_plante() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    //j'ai pas terminer .il faut catcher l'exception 
    public void Testfeu(){
        
            //Appends : preparation des objet
            HerosTerre ht = new HerosTerre("Terramon", 150, 100, 25);
            System.out.println(ht.toString());
            HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
            System.out.println(hm.toString());
            HerosFeu hf = new HerosFeu("Firomon", 1, 213, 7);
            System.out.println(hf.toString());
            //act: execution de la methode testéé
            hf.combat(ht);
            hf.combat(hm);
            ht.combat(hf);
            hm.combat(hf);
           
            // assert: verification du resultat
            assertEquals(0.0, hf.getPointsvie(), 0.0001);
    }
}
