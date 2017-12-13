/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuHeros;
/**
 *
 * @author SAGAR GUEYE
 * @version 1.0.0
 */
public abstract class Heros implements StructHeros {

    protected String nom;
    protected double pointsvie;

    /**
     * CONSTRUCTEUR VIDE
     */
    public Heros() {
        this.nom = "";
        this.pointsvie = 0;
    }

    /**
     * constructeur NON VIDE
     *
     * @param nom
     * @param pointsVie
     */
    public Heros(String nom, double pointsVie) {
        this.nom = nom;
        this.pointsvie = pointsVie;
    }

    /**
     * methode qui affiche les details d'un heros
     */
    @Override
    public abstract String toString();

    /**
     * methode abstract qui calcule la puissance d'un heros
     * @return
     */
    @Override
    public abstract double calculePuissance();

    /**
     * methode qui permet de connaitre l'etat d'un heros s'il est toujours
     * vivant ou non selon ses points de vie
     */
    @Override
    public void etat() {
        if (pointsvie > 0) {
            System.out.println(this.getnom() + " est vivant "
                    + "et il lui reste :" + pointsvie + " point de vie");
        } else {
            System.out.println(this.getnom() + " est mort");
        }
    }

    /**
     * Methode abstract qui fait combrattre 2 heros. elle prend comme parametre
     * un autre heros qui sera en defense
     * @param herosDefense
     */
   
    public abstract void combat(JeuHeros herosDefense);

    /**
     * methoe qui calcule le nombre de point de vie restant aprés un combat
     * @param PointsPerdus
     */
    @Override
    public void perdpoints(double PointsPerdus) {
        pointsvie = pointsvie - PointsPerdus;
    }

    public double getPointsvie() {
        return pointsvie;
    }

    @Override
    public String getnom() {
        return nom;
    }
}
