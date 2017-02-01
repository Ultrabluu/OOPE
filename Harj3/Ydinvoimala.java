/*
 * Viikkoharjoitus 3, tehtävä 3.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettista ydinvoimalaa mallintava luokka.
 *
 */

public class Ydinvoimala extends Voimala {
    
    public Ydinvoimala(double mw) {
        super(mw);
    }
    
    public void hajoa(){
        System.out.println("Ydin poks!");
    }
    
}
