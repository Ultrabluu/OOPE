package tehtava3;
/*
 * Luennot 5 ja 6.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Nisakas-luokasta peritty konkreettinen Kissa-luokka.
 *
 */

public class Kissa extends Nisakas implements Tervehtiva {

   /*
    * Attribuutit.
    *
    */

   // Kissan v�ri.
   private String vari;

   // Kissan h�nn�n tyyppi (esimerkiksi "kippura").
   private String hanta;

   /*
    * Rakentajat.
    *
    */

   /* Oletusrakentaja.
    */
   public Kissa() {
      vari = "musta";
      hanta = "kippura";
   }  

   /* Parametrillinen rakentaja,
    * jossa alustetaan vari (v) ja hanta (h). 
    */ 
   public Kissa(String v, String h) {
      // Koodia lyhennetty aksessoreita kutsumalla,
      // jolloin tarvitaan v�hemm�n if-lauseita.
      vari(v);
      hanta(h);
   }

   /* Parametrillinen rakentaja,
    * jossa alustetaan elossa (e), paino (p), vari (v) ja hanta (h).
    */
   public Kissa(boolean e, double p, String v, String h) {
      // Kutsutaan yliluokan rakentajaa.
      // Huom! Kissat l�hestulkoon aina turkillisia.
      super(e, p, true);

      // Koodia lyhennetty aksessoreita kutsumalla,
      // jolloin tarvitaan v�hemm�n if-lauseita.
      vari(v);
      hanta(h);
   }

   /*
    * Kissan k�tketyt oliometodit.
    *
    */

   private void hairikoi() {
      // Tavaroita hajoaa...
   }

   /*
    * Kissan aksessorit.
    *
    */

   public String vari() { 
      return vari;
   }

   public void vari(String v) {
      if (v != null)
         vari = v;
   }

   public String hanta() {
      return hanta;
   }

   public void hanta(String h) {
      if (h != null)
         hanta = h;
   }

   /*
    * Kissan muut oliometodit.
    *
    */

   /* Tulostetaan parametrina (s) annettua "��ntely�".
    */
   public void aantele(String s) { 
      System.out.println(s);
   }

   /* Kissa sanoo n�in tyytyv�isen�.
    */
   public void kehraa() {
      System.out.println("murr, murrrr...");
   }

   /*
    * Korvatut metodit.
    *
    */

   /* Kissamaista sy�mist�.
    */
   public void syo() {
      System.out.println("Sy�n kuin kissa...");
      kehraa();
   }

   /* Karkea s��nt� kissan koon arviointiin.
    */   
   public boolean onkoIso() {
      return paino() > 10;
   }
   
   public boolean onkoIso(double d) {
       return d > 10;
   }

   /*
    * Toteutetut metodit.
    *
    */

   /* Kissamainen moi.
    */
   public void moikkaa() { 
      System.out.println("Miu! Pusken jalkaa..."); 
   }

   public void moikkaa(Object x) {
       if (x != null && x instanceof Elain)  
       {
           Elain apu = (Elain)x;               
           if ( onkoIso(apu.paino()) == true )
               moikkaa();
       }
                    
   }

}