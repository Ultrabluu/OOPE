/* 
 * Viikkoharjoitus 2, tehtävä 1.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Talvipakkasilla tarvittavaa vaatekappaletta mallintava luokka.
 *
 */

public class Pipo {

   /* 
    * Koon sallitut arvot julkisina vakioituina vakioina.
    *
    */

   // XXSmall.
   public static final String XXS = "XXS";

   // XSmall.
   public static final String XS = "XS";

   // Small.
   public static final String S = "S";

   // Medium.
   public static final String M = "M";

   // Large.
   public static final String L = "L";

   // XLarge
   public static final String XL = "XL";

   // XXLarge
   public static final String XXL = "XXL";

   /* 
    * Attribuutit.
    *
    */

   // Pipon koko.
   private String koko;

   /* 
    * Rakentajat.
    *
    */

   public Pipo() {
      koko(M);
   }

   public Pipo(String uusiKoko) {
      koko(uusiKoko);
   }
   
   public boolean equals(Object pipo) {
       try {
           if (pipo != null)
               return pipo.equals(koko());       
       }
       catch (Exception e) {
           System.out.println(e);
       }
       return false;

   }

   /* 
    * Aksessorit.
    *
    */

   public String koko() {
      return koko;
   }

   public void koko(String uusiKoko) {
      if (kokoOK(uusiKoko))
         koko = uusiKoko;
   }

   /* 
    * Apuoperaatiot.
    *
    */

   /* Palauttaa arvon true, jos uudeksi kooksi tarjottu arvo on tunnettu.
    */
   private boolean kokoOK(String uusiKoko) {
      return uusiKoko != null && (uusiKoko.equals(XXS) || uusiKoko.equals(XS)
      || uusiKoko.equals(S) || uusiKoko.equals(M) || uusiKoko.equals(L)
      || uusiKoko.equals(XL) || uusiKoko.equals(XXL));
   }
}