/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceheros;

/**
 *
 * @author p1623082
 */
public class HerosFeu extends Heros  {
    private double taille;
    private double puissanceFeu;
    
    public HerosFeu()
    {
        super();
        this.taille=0;
        this.puissanceFeu=0;
    }
    
    public HerosFeu(String nom, double pointsVie, double taille, double puissanceFeu)
    {
        super(nom, pointsVie);
        this.taille=taille;
        this.puissanceFeu=puissanceFeu;
    }
    /**la methide qui permet de calculer la puissance du heros feu
     * 
     * @return 
     */
    
     public double calculePuissance()
    {
        return taille/100*puissanceFeu;
    }
     /**  affichage
      * 
      * @return 
      */
    @Override
    public String toString()
    {
        return "heros de feu Firomon vie : "+pointsvie
                +" \nMesure :"+taille+" cm, puissance de Feu : "
                +puissanceFeu;
    }
    
   /** la methode combat
    * 
    * @param h
    * @Override
    */ 
    @Override
   public  void combat(Heros herosDefense)
    {
        if (this.pointsvie<20)
            System.out.println("Aucune attaque n'a eu lieu");
        else
        {
            if(this.calculePuissance()>herosDefense.calculePuissance())
            herosDefense.perdpoints(60);
        else if (this.calculePuissance()==herosDefense.calculePuissance())
            herosDefense.perdpoints(20);
        }
            this.etat();
        herosDefense.etat();   
        
    }
   
}
