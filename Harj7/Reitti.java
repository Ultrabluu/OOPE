/*
 * Viikkoharjoitus 7, teht�v� 5.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen reitti� mallintava luokka.
 *
 */

public class Reitti extends Kaupunki {
    
    private int pituus;
    
    @Override
    public String toString() {
        return super.toString() +" pituus: "+ pituus;
    }
}
