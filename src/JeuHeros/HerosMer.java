/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuHeros;

/**
 *
 * @author p1623082
 */
public class HerosMer extends Heros {
    private double nbNageoire;
    private double vitesse;
    public HerosMer(String nom, double pointsVie,
            double nbNageoire, double vitesse)
    {
        super(nom, pointsVie);
        this.nbNageoire=nbNageoire;
        this.vitesse=vitesse;
    }
    public String toString()
    { 
        return "Héros de mer " +nom + " vie : "+pointsvie+ "\npossède "+nbNageoire+ 
            " nageoires, vitesse "+vitesse + " km/h";
    }
     public  double calculePuissance()
     {
         return nbNageoire*vitesse;
     }
     
    public  void combat(Heros herosDefense)
    {
     if(this.calculePuissance()>herosDefense.calculePuissance())
            herosDefense.perdpoints(50);
        else if (this.calculePuissance()==herosDefense.calculePuissance())
        {
            if (this.pointsvie>=50)
                herosDefense.perdpoints(25);
        }
     else
        {
           if (this.pointsvie>=50)
                herosDefense.perdpoints(15); 
           else
               this.perdpoints(10);
        }
            
        this.etat();
        herosDefense.etat();   
    }
   
}
