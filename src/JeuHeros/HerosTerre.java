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
public class HerosTerre extends Heros{
     private double poids;
    private double agilite;
    public HerosTerre(String nom, double pointsVie, 
            double poids, double agilite)
    {
        super(nom, pointsVie);
        this.poids=poids;
        this.agilite=agilite;
    }
    public String toString()
    { 
        return "Héros de terre " +nom + " vie : "+pointsvie+ "\npèse "+poids+ 
            " kg, agilité "+agilite;
    }
     public  double calculePuissance()
     {
         return poids/20*agilite;
     }
          
     @Override
    public void combat(Heros herosDefense) throws ZeroVieException {
       if (this.pointsvie == 0) {
            throw new ZeroVieException(this.pointsvie);
        }
    
        if(this.calculePuissance()>herosDefense.calculePuissance())
            herosDefense.perdpoints(40);
        else if (this.calculePuissance()<herosDefense.calculePuissance())
            this.perdpoints(15);
        this.etat();
        herosDefense.etat();
            
    }

    @Override
    public void combat(JeuHeros herosDefense) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
