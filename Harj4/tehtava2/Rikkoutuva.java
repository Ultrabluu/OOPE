package tehtava2;
/* 
 * Viikkoharjoitus 4, tehtävä 2.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2016, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Rajapinta rikkoutuville olioille, joita voidaan mahdollisesti myös korjata.
 *
 */

public interface Rikkoutuva {

   /* Yritetään rikkoa olio.
    */
   public abstract void rikkoudu();

   /* Yritetään korjata olio.
    */
   public abstract void korjaudu();

   /* Palauttaa tiedon rikkonaisuudesta. Paluuarvo on true, jos olio on rikki
    * ja false, jos olio on ehjä.
    */
   public abstract boolean onkoRikki();
}