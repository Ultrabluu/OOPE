/*
 * Viikkoharjoitus 3, teht�v� 6.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Kettua mallintava luokka, joka perii Nisakkaan, ja t�m�n superluokan,
 * el�imen, sek� implementoi Tehtehtiva.rajapinnan. 
 *
 */

public class Kettu  extends Nisakas implements Tervehtiva  {
    
    public Kettu() {
        super(true, 5, true);
    }
    
    public void moikkaa() {
        System.out.println("*Kettu tervehtii*");
    }
    
    public void syo() {
        System.out.println("OM NOM NOM! Sy�n kuin kettu.");
    }

}
