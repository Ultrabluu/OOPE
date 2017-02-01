/*
 * Luento 6.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Yksinkertainen abstrakti Elain-luokka.
 *
 */

public abstract class Elain {

   /*
    * Attribuutit.
    *
    */

   // true = elää, false = edesmennyt.
   private boolean elossa;

   // Eläimen paino (> 0) kiloina.
   private double paino;

   /*
    * Rakentajat.
    *
    * Huom! Rakentajia voidaan kirjoittaa myös abstraktiin luokkaan,
    * vaikka tällaisestä luokasta ei voidakaan luoda olioita.
    *
    */

   public Elain() {
      paino = 0.1;
      elossa = true;
   }

   public Elain(boolean e, double p) {
      elossa(e);
      paino(p);
   }

   /*
    * Aksessorit.
    *
    */

   public boolean elossa() {
      return elossa;
   }

   public void elossa(boolean e) {
      elossa = e;
   }

   public double paino() {
      return paino;
   }

   public void paino(double kg) {
      if (kg > 0)
         paino = kg;
   }

   /*
    * Abstraktit oliometodit.
    *
    */

   public abstract void syo();

   public abstract boolean onkoIso();
}