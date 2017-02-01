/*
 * Viikkoharjoitus 3, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Kettua mallintava luokka, joka perii Nisakkaan, ja tämän superluokan,
 * eläimen, sekä implementoi Tehtehtiva.rajapinnan. 
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
        System.out.println("OM NOM NOM! Syön kuin kettu.");
    }

}
