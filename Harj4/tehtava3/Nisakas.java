package tehtava3;

/*
 * Luento 6.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Yksinkertainen abstrakti Nisakas-luokka.
 *
 * Toteuttaa perityt abstraktit metodit.
 *
 */

public abstract class Nisakas extends Elain {

   /*
    * Attribuutit.
    *
    */

   private boolean turkillinen;

   /*
    * Rakentajat.
    *
    */

   public Nisakas() {
      // Suurimmalla osaa nisäkkäistä turkki.
      turkillinen(true);
   }

   public Nisakas(boolean onkoTurkki) {
      turkillinen(onkoTurkki);
   }

   public Nisakas(boolean e, double p, boolean t) {
      // Kutsutaan yliluokan rakentajaa.
      super(e, p);
      turkillinen(t);
   }

   /*
    * Aksessorit
    *
    */

   public boolean turkillinen() {
      return turkillinen;
   }

   public void turkillinen(boolean onkoTurkki) {
      turkillinen = onkoTurkki;
   }

   /*
    * Muut oliometodit.
    *
    */

   /* Nisäkäsmäistä syömistä.
    */
   public void syo() {
      System.out.println("Syön kuin nisäkäs...");
   }

   /* Oletetaan suurin osa nisäkkäistä "pieniksi".
    */
   public boolean onkoIso() {
      return false;
   }
}