/*
 * Viikkoharjoitus 4, teht�v� 4.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Testiluokka oudoille otuksille.
 *
 */

// Otetaan k�ytt��n pakatut otukset.
import tehtava4.otukset.*;


public class OOTesti {

   /* Moikataan otuksia ja tulostetaan taulukon t alkioiden viittaamien
    * otuksen vastineet n�yt�lle. Huomaa, ett� instanceof-operaattori
    * palauttaa false-arvon, jos sille annettu viite on null-arvoinen.
    */
   public static void moikkaa(OutoOtus[] t) {
      // Aloitetaan moikkaamalla itse.
      System.out.println("Moikka!");

      // K�yd��n taulukko l�pi alkio kerrallaan.
      for (int i = 0; i < t.length; i++) {
          OutoOtus otus = t[i];
          otus.aantele();
      }
   }

   public static void main(String[] args) {
      // Otusten lukum��r�.
      final int LKM = 5;

      // Luodaan taulukko otuksille. Taulukon viitteiden arvoiksi asetetaan
      // automaattisesti null-arvo.
      OutoOtus[] otos = new OutoOtus[LKM];

      // Kullakin kierroksella luodaan satunnaisesti otus
      // ja asetetaan otukseen viite taulukosta.
      for (int i = 0; i < LKM; i++)
         // Kummallakin tyypill� noin 50 % todenn�k�isyys.
         if (Math.random() < 0.5)
            otos[i] = new Muhku();
         else
            otos[i] = new Mohko();

      // Moikataan otuksia.
      moikkaa(otos);
   }
}
