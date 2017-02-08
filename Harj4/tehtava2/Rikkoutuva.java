package tehtava2;
/* 
 * Viikkoharjoitus 4, teht�v� 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2016, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Rajapinta rikkoutuville olioille, joita voidaan mahdollisesti my�s korjata.
 *
 */

public interface Rikkoutuva {

   /* Yritet��n rikkoa olio.
    */
   public abstract void rikkoudu();

   /* Yritet��n korjata olio.
    */
   public abstract void korjaudu();

   /* Palauttaa tiedon rikkonaisuudesta. Paluuarvo on true, jos olio on rikki
    * ja false, jos olio on ehj�.
    */
   public abstract boolean onkoRikki();
}