/*
 * Viikkoharjoitus 5, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen ydinvoimalaa mallintava luokka, joka periytyy voimalasta.
 *
 */

public class Ydinvoimala extends Voimala {
    
    private Ydinreaktori ydinreaktori = new Ydinreaktori(100);

   /*
    * Rakentajat.
    *
    */

   public Ydinvoimala(double mw) {
      // Kutsutaan yliluokan rakentajaa.
      super(mw);
   }
   

   /*
    * Oliometodit.
    *
    */

   // Korvattu metodi, jossa kerrotaan kuinka ydinvoimala hajoaa.
   public void hajoa() {
      System.out.println("POKS! Ydin suli ja kiire tuli...");
   }
   
   public void jaljella(double p) throws IllegalArgumentException {
       ydinreaktori.setTeho(p);
   }
   
   @Override
   public String toString() {
       return super.toString() + " " + ydinreaktori.toString();
   }
   
}