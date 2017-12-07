/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceheros;

/**main
 *@version 
 * @author p1623082
 */
public class InterfaceHeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HerosTerre ht=new HerosTerre("Terramon", 150, 100, 25);
        System.out.println(ht.toString());
        HerosMer hm = new HerosMer("Hydromon", 170, 6, 30);
        System.out.println(hm.toString());
        HerosFeu hf = new HerosFeu("Firomon", 140, 213,7);
        System.out.println(hf.toString());
        hf.combat(ht);
        hm.combat(ht);
        ht.combat(hf);
        hf.combat(ht);
        ht.combat(hf);
        ht.combat(hf);
        ht.combat(hf);
    }
    
}
