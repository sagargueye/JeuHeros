/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JeuHeros.HerosFeu;
import JeuHeros.HerosMer;
import JeuHeros.HerosTerre;
import JeuHeros.ZeroVieException;
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
    //j'essaie d'organiser un combat avec 0 point de vie au départ
    //normalement ça devrait pas marcher 
    // surprise! ça a marché avec un resultat négatif
    // Du coup j'ai l'obligation de traiter cette erreur
    //en creant une exception qui va se declencher 
    //dés qu'on organise un combat avec zero point de vie au depart
    public void Testfeu() {
        ZeroVieException exception = null;
        try {
            //Appends : preparation des objet
            HerosTerre ht = new HerosTerre("Terramon", 150, 100, 25);
            System.out.println(ht.toString());
            HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
            System.out.println(hm.toString());
            HerosFeu hf = new HerosFeu("Firomon", 0, 213, 7);
            System.out.println(hf.toString());
            //act: execution de la methode testéé
            hf.combat(ht);
            hf.combat(hm);
            ht.combat(hf);
            hm.combat(hf);

        } catch (ZeroVieException ex) {
            exception = ex;
        }
        assertNotNull(exception);
    }
}
