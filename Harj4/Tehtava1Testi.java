// Otetaan käyttöön pakkauksen sisältö.
import tehtava1.*;


/* 
 * Viikkoharjoitus 4, tehtävä 1.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Pakattua esineiden luokkahierarkiaa testaava luokka, jota EI OLE SYYTÄ MUUTTAA
 * MILLÄÄN TAVALLA, koska WETO käyttää aina tämän luokan alkuperäistä versiota.
 *
 * Huomaa, että joudut antamaan  Esine-, Avain- ja Sanko-luokkien lukuaksesessoreille
 * testiluokan olettamat nimet, jos olet koonnut pakkauksen 3. harjoituksen
 * 2. tehtävään itse tekemistäsi luokista.
 *
 */

public class Tehtava1Testi {
   public static void main(String[] args) {
      // Esitellään viite, luodaan olio ja yritetään alustaa se käyttäjän
      // antamilla arvoilla ja lopuksi liitetään viite olioon.
      Sanko satunnainenSanko = new Sanko();
      Avain omaAvain = new Avain(1025, false);

      // Kutsutaan luokkien yhteistä lukuoperaatiota "muovia".
      System.out.println(satunnainenSanko.muovia());     // true
      System.out.println(omaAvain.muovia());             // false

      // Kutsutaan luokkien omia lukuoperaatioita "tilavuus" ja "numero".
      System.out.println(satunnainenSanko.tilavuus());   // Arvo väliltä [1, 10].
      System.out.println(omaAvain.numero());             // 1025
   }
}