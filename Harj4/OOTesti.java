/*
 * Viikkoharjoitus 4, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Testiluokka oudoille otuksille.
 *
 */

// Otetaan käyttöön pakatut otukset.
import tehtava4.otukset.*;


public class OOTesti {

   /* Moikataan otuksia ja tulostetaan taulukon t alkioiden viittaamien
    * otuksen vastineet näytölle. Huomaa, että instanceof-operaattori
    * palauttaa false-arvon, jos sille annettu viite on null-arvoinen.
    */
   public static void moikkaa(OutoOtus[] t) {
      // Aloitetaan moikkaamalla itse.
      System.out.println("Moikka!");

      // Käydään taulukko läpi alkio kerrallaan.
      for (int i = 0; i < t.length; i++) {
          OutoOtus otus = t[i];
          otus.aantele();
      }
   }

   public static void main(String[] args) {
      // Otusten lukumäärä.
      final int LKM = 5;

      // Luodaan taulukko otuksille. Taulukon viitteiden arvoiksi asetetaan
      // automaattisesti null-arvo.
      OutoOtus[] otos = new OutoOtus[LKM];

      // Kullakin kierroksella luodaan satunnaisesti otus
      // ja asetetaan otukseen viite taulukosta.
      for (int i = 0; i < LKM; i++)
         // Kummallakin tyypillä noin 50 % todennäköisyys.
         if (Math.random() < 0.5)
            otos[i] = new Muhku();
         else
            otos[i] = new Mohko();

      // Moikataan otuksia.
      moikkaa(otos);
   }
}
