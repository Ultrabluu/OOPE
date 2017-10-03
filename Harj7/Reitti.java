/*
 * Viikkoharjoitus 7, tehtävä 5.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen reittiä mallintava luokka.
 *
 */

public class Reitti extends Kaupunki {
    
    private int pituus;
    
    @Override
    public String toString() {
        return super.toString() +" pituus: "+ pituus;
    }
}
