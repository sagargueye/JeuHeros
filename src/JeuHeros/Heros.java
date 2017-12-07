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
public abstract class Heros implements StructHeros {

    protected String nom;
    protected double pointsvie;

    public Heros() {
        this.nom = "";
        this.pointsvie = 0;
    }

    public Heros(String nom, double pointsVie) {
        this.nom = nom;
        this.pointsvie = pointsVie;
    }

    @Override
    public String getnom() {
        return nom;
    }
    
    public void etat() {
        if (pointsvie > 0) {
            System.out.println(this.getnom() + " est vivant "
                    + "et il lui reste :" + pointsvie + " point de vie");
        } else {
            System.out.println(this.getnom() + " est mort");
        }
    }

    /**
     * methoe qui calcule le nombre de point de vie restant
     *
     * @param nbPointsPerdus
     */

    public void perdpoints(double PointsPerdus) {
        pointsvie = pointsvie - PointsPerdus;
    }

    public abstract String toString();

    public abstract void combat(Heros herosDefense);

    public abstract double calculePuissance();

}
