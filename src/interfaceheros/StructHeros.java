/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceheros;

/**classe d'interface
 *@version 1.0
 * @author p1623082
 */
public interface StructHeros {

    /**
     *
     * @return
     */
    @Override
    public String toString();
    public String getnom();
    public void etat();
    public double calculePuissance();
    public void combat(Heros herosDefense);
    public void perdpoints(double PointsPerdus);
}
