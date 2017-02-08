// Otetaan k�ytt��n pakkauksen sis�lt�.
import tehtava2.*;

/* 
 * Viikkoharjoitus 4, teht�v� 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Pakattua rikkoutuvien esineiden luokkahierarkiaa testaava luokka,
 * jota EI OLE SYYT� MUUTTAA MILL��N TAVALLA, koska WETO k�ytt�� aina t�m�n
 * luokan alkuper�ist� versiota.
 *
 * Huomaa, ett� t�ll� kurssilla on poikkeuksellista, ett� main-metodi heitt��
 * poikkeuksen. Voit edelleen kirjoittaa testiluokan main-metodin otsikon juuri
 * niin kuin se on aiemmin opetettu.
 *
 */

public class Tehtava2Testi {
   public static void main(String[] args) throws Exception {
      // Avaimeen ja sankoon voidaan liitt�� rajapinnan tyyppinen viite,
      // jos yliluokka on toteuttanut rajapinnan.
      Rikkoutuva satunnainenSanko = new Sanko();
      Rikkoutuva omaAvain = new Avain(1025, false);

      // Pys�ytet��n ohjelma heitt�m�ll� poikkeus, jos olio on jo luodessa
      // virheellisess� tilassa.
      if (satunnainenSanko.onkoRikki() || omaAvain.onkoRikki())
         throw new Exception("Valmiiksi rikki!");

      // Pys�ytet��n ohjelma heitt�m�ll� poikkeus, jos ei saada rikottua.
      satunnainenSanko.rikkoudu();
      omaAvain.rikkoudu();
      if (satunnainenSanko.onkoRikki() == false || omaAvain.onkoRikki() == false)
         throw new Exception("Ei rikkoutunut!");

      // Pys�ytet��n ohjelma heitt�m�ll� poikkeus, jos sanko ei korjaudu.
      satunnainenSanko.korjaudu();
      if (satunnainenSanko.onkoRikki() == true)
         throw new Exception("Ei korjautunut!");

      // Pys�ytet��n ohjelma heitt�m�ll� poikkeus, jos avain korjautuu.
      omaAvain.korjaudu();
      if (omaAvain.onkoRikki() == false)
         throw new Exception("Korjautui!");
   }
}
