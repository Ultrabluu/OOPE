// Otetaan käyttöön pakkauksen sisältö.
import tehtava2.*;

/* 
 * Viikkoharjoitus 4, tehtävä 2.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Pakattua rikkoutuvien esineiden luokkahierarkiaa testaava luokka,
 * jota EI OLE SYYTÄ MUUTTAA MILLÄÄN TAVALLA, koska WETO käyttää aina tämän
 * luokan alkuperäistä versiota.
 *
 * Huomaa, että tällä kurssilla on poikkeuksellista, että main-metodi heittää
 * poikkeuksen. Voit edelleen kirjoittaa testiluokan main-metodin otsikon juuri
 * niin kuin se on aiemmin opetettu.
 *
 */

public class Tehtava2Testi {
   public static void main(String[] args) throws Exception {
      // Avaimeen ja sankoon voidaan liittää rajapinnan tyyppinen viite,
      // jos yliluokka on toteuttanut rajapinnan.
      Rikkoutuva satunnainenSanko = new Sanko();
      Rikkoutuva omaAvain = new Avain(1025, false);

      // Pysäytetään ohjelma heittämällä poikkeus, jos olio on jo luodessa
      // virheellisessä tilassa.
      if (satunnainenSanko.onkoRikki() || omaAvain.onkoRikki())
         throw new Exception("Valmiiksi rikki!");

      // Pysäytetään ohjelma heittämällä poikkeus, jos ei saada rikottua.
      satunnainenSanko.rikkoudu();
      omaAvain.rikkoudu();
      if (satunnainenSanko.onkoRikki() == false || omaAvain.onkoRikki() == false)
         throw new Exception("Ei rikkoutunut!");

      // Pysäytetään ohjelma heittämällä poikkeus, jos sanko ei korjaudu.
      satunnainenSanko.korjaudu();
      if (satunnainenSanko.onkoRikki() == true)
         throw new Exception("Ei korjautunut!");

      // Pysäytetään ohjelma heittämällä poikkeus, jos avain korjautuu.
      omaAvain.korjaudu();
      if (omaAvain.onkoRikki() == false)
         throw new Exception("Korjautui!");
   }
}
