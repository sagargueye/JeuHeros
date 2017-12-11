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
    public void Test1 ()
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
       /* hm.combat(ht);
        ht.combat(hf);
        hf.combat(ht);
        ht.combat(hf);
        ht.combat(hf);
        ht.combat(hf); */
       
         // assert: verification du resultat
       assertEquals(140.0, hf.getPointsvie(), 0.0001);
         
         
       /*   //Appends : preparation des objet
        Professionel p = new Professionel("MedicPlus", "adresse", "tel");
        RendezVous rdv= new RendezVous(9,"rendezvous test", p);
        Jour jrs= new Jour (8, 12);
        //act: execution de la methode testéé
        boolean result = jrs.placerRendezVous(9, rdv);
        // assert: verification du resultat
        assertFalse(result);*/
    }

}
