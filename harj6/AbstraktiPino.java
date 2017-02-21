/*
 * Luento 11.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Pino-rajapinnan suppein mahdollinen toteutus abstraktissa luokassa.
 *
 * Pinon koolle asetetaan yläraja.
 *
 */

public abstract class AbstraktiPino implements Pino {
   /*
    * Attribuutit.
    *
    */

   // Alkioiden maksimimäärä.
   private int maxKoko;

   /*
    * Rakentajat.
    *
    */

   public AbstraktiPino(int m) {
      if (m >= 0)
         maxKoko = m;
      else
         maxKoko = 0;
   }

   /*
    * Aksessorit.
    *
    */

   public int maxKoko() {
      return maxKoko;
   }

   /*
    * Pinon operaatioiden korvaus toteuttamalla.
    *
    */

   public boolean lisaa(Object o) {
      return false;
   }

   public Object poista() {
      return null;
   }

   public int koko() {
      return 0;
   }

   public boolean onkoTyhja() {
      return true;
   }

   public Object ylin() {
      return null;
   }
}