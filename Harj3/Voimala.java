/*
 * Viikkoharjoitus 3, teht�v� 3.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen voimalaa mallintava luokka.
 *
 */

public class Voimala {

   /*
    * Attribuutit.
    *
    */

   // Voimalan teho megawatteina.
   private double teho;

   /*
    * Rakentajat.
    *
    */

   public Voimala(double mw) {
      teho(mw);
   }
   

   /*
    * Aksessorit.
    *
    */

   public double teho() {
      return teho;
   }

   public void teho(double mw) {
      if (mw >= 0)
         teho = mw;
   }

   /*
    * Oliometodit.
    *
    */

   public void hajoa() {
       
      System.out.println("Poks!");
   }
   
   public void hajoa(double tn) {
       // Muuttuja saa true-arvon metodille parametrina annetulla
       // todenn�k�isyydell� tn.
       boolean hajoa = Math.random() < tn / 100;
       if (hajoa == true)
           hajoa();
   }
}

