/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuHeros;

/**
 *
 * @author sagar
 */
public class ZeroVieException extends Exception{
   public ZeroVieException(double pointsvie)
    {
        super (pointsvie+" le nombre de vie ne doit pas etre null");
    }
    
}
