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
public class Cas_Ou_Cest_OK {
    
    public Cas_Ou_Cest_OK() {
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
    public void Testfeu ()
    {
         //Appends : preparation des objet
         HerosTerre ht=new HerosTerre("Terramon", 150, 100, 25);
        System.out.println(ht.toString());
        HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
        System.out.println(hm.toString());
        HerosFeu hf = new HerosFeu("Firomon", 140, 213,7);
        System.out.println(hf.toString());
        //act: execution de la methode testéé
        hf.combat(ht);
        hf.combat(hm);
        ht.combat(hf);
        hm.combat(hf);
        // assert: verification du resultat
       assertEquals(50.0, hf.getPointsvie(), 0.0001);
       
    }
    @Test
    public void Testherosterre ()
    {
         //Appends : preparation des objet
         HerosTerre ht=new HerosTerre("Terramon", 150, 100, 25);
        System.out.println(ht.toString());
        HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
        System.out.println(hm.toString());
        HerosFeu hf = new HerosFeu("Firomon", 140, 213,7);
        System.out.println(hf.toString());
        //act: execution de la methode testéé
        ht.combat(hf);
        ht.combat(hm);
        hf.combat(ht);
        hm.combat(ht);
       // assert: verification du resultat
       assertEquals(85.0, ht.getPointsvie(), 0.0001);
    }
    @Test
    public void Testherosmer ()
    {
         //Appends : preparation des objet
         HerosTerre ht=new HerosTerre("Terramon", 150, 100, 25);
        System.out.println(ht.toString());
        HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
        System.out.println(hm.toString());
        HerosFeu hf = new HerosFeu("Firomon", 140, 213,7);
        System.out.println(hf.toString());
        //act: execution de la methode testéé
        hm.combat(hf);
        hm.combat(ht);
        hf.combat(hm);
        ht.combat(hm);
       // assert: verification du resultat
       assertEquals(170.0, hm.getPointsvie(), 0.0001);
    }
}
