import java.util.Random;

/*
 * Viikkoharjoitus 5, teht�v� 7.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Jokea karkeasti mallintava luokka, jossa on virhe.
 *
 */

public class Joki {

   /*
    * Attribuutit.
    *
    */

   // Joen minimi- ja maksimipituus vakioina.
   private final double MINPIT = 0.01;
   private final double MAXPIT = 6650;

   // Joen pituus kilometrein�.
   private double pituus;

   // Maanosa, jossa joki sijaitsee.
   private String maanosa;

   /*
    * Rakentajat.
    *
    */

   public Joki() {
      // Luodaan pseudosatunnaislukuja tuottava olio.
      Random generaattori = new Random();

      // Tuotetaan satunnaisluku ja asetetaan se attribuutin arvoksi.
      // Satunnaisluku on v�lilt� [MINPIT, MAXPIT].
      pituus = (MAXPIT - MINPIT) * generaattori.nextDouble() + MINPIT;

      // Asetetaan arvo my�s toiselle attribuutille.
      maanosa = "Eurooppa";
   }

   public Joki(double km, String mo) {
      // Hy�dynnet��n valmista koodia ja hyv�ksyt��n se, ett� olion tiedot voivat
      // j��d� alustamatta joko osin tai kokonaan.
      pituus(km);
      maanosa(mo);
   }

   /*
    * Apulaiset.
    *
    */

   /* Paluuarvo on tosi, jos maanosa on tunnettu.
    */
   private boolean tarkistaMaanosa(String mo) {
      boolean onOK = mo != null && (mo.equals("Aasia") || mo.equals("Afrikka")
      || mo.equals("Australia") || mo.equals("Etel�-Amerikka")
      || mo.equals("Etel�manner") || mo.equals("Eurooppa")
      || mo.equals("Pohjois-Amerikka"));
      return onOK;
   }

   /*
    * Aksessorit.
    *
    */

   public double pituus() {
      return pituus;
   }

   public void pituus(double km) {
      if (km >= MINPIT)
         pituus = km;
   }

   public String maanosa() {
      return maanosa;
   }

   public void maanosa(String mo) {
      boolean moOK = tarkistaMaanosa(mo);
      if (moOK)
         maanosa = mo;
   }

   /*
    * Object-luokan metodien korvaukset.
    *
    */

   public String toString() {
      // Muodostetaan tiedoista merkkijonoesitys ja palautetaan se.
      return "~~~ " + pituus + " km, " + maanosa + " ~~~";
   }
   // Tyyppimerkkaus vaihdettu Joesta Objektiin, koska muuten javan oma equals metodi ei tuli yliajetuksi.
   @Override
   public boolean equals(Object vertailtava) {
      try {
          
         // Asetetaan vertailtavaan olioon apuviite, jonka kautta saadaan
         // k�ytt��n ("n�hd��n") vertailuun tarvittavat piirteet.
         Joki toinenJoki = (Joki)vertailtava;
         // Verrataan tietoja, lasketaan yhteistulos ja palautetaan se.
         boolean samaMaanosa = maanosa.equals(toinenJoki.maanosa());
        
         boolean samaPituus = pituus == toinenJoki.pituus();
         return samaMaanosa && samaPituus;
      }
      // Poikkeuksen tapahtuessa joet eiv�t ole samoja.
      catch (Exception e) {
         return false;
      }
   }
}