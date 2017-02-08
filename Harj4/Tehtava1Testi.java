// Otetaan k�ytt��n pakkauksen sis�lt�.
import tehtava1.*;


/* 
 * Viikkoharjoitus 4, teht�v� 1.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Pakattua esineiden luokkahierarkiaa testaava luokka, jota EI OLE SYYT� MUUTTAA
 * MILL��N TAVALLA, koska WETO k�ytt�� aina t�m�n luokan alkuper�ist� versiota.
 *
 * Huomaa, ett� joudut antamaan  Esine-, Avain- ja Sanko-luokkien lukuaksesessoreille
 * testiluokan olettamat nimet, jos olet koonnut pakkauksen 3. harjoituksen
 * 2. teht�v��n itse tekemist�si luokista.
 *
 */

public class Tehtava1Testi {
   public static void main(String[] args) {
      // Esitell��n viite, luodaan olio ja yritet��n alustaa se k�ytt�j�n
      // antamilla arvoilla ja lopuksi liitet��n viite olioon.
      Sanko satunnainenSanko = new Sanko();
      Avain omaAvain = new Avain(1025, false);

      // Kutsutaan luokkien yhteist� lukuoperaatiota "muovia".
      System.out.println(satunnainenSanko.muovia());     // true
      System.out.println(omaAvain.muovia());             // false

      // Kutsutaan luokkien omia lukuoperaatioita "tilavuus" ja "numero".
      System.out.println(satunnainenSanko.tilavuus());   // Arvo v�lilt� [1, 10].
      System.out.println(omaAvain.numero());             // 1025
   }
}