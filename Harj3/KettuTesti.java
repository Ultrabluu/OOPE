/*
 * Viikkoharjoitus 3, teht�v� 6.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Kettua testaava luokka, jota EI OLE SYYT� MUUTTAA MILL��N TAVALLA,
 * koska WETO k�ytt�� aina t�m�n luokan alkuper�ist� versiota.
 *
 */

public class KettuTesti {
   public static void main(String[] args) {
      // Esitell��n viite, luodaan olio ja alustetaan se ja liitet��n olioon viite.
      Kettu repolainen = new Kettu();
      System.out.println(repolainen.elossa());        // true
      System.out.println(repolainen.paino());         // 5.0
      System.out.println(repolainen.turkillinen());   // true
      System.out.println(repolainen.onkoIso());       // false

      // Vapaavalintaisesti kuvailtua sy�mist� ja tervehtimist�.
      repolainen.syo();
      repolainen.moikkaa();

      // Testataan viel� kierrommin ja tutustutaan samalla lis�� rajapintoihin.
      // Kettu toteuttaa Tervehtiva-rajapinnan ja on siten my�s Tervehtiva-tyyppi�.
      // Liitet��n olioon esimerkinomaisesti Tervehtiva-viite ja kutsutaan sen
      // kautta rajapinnan toteutettua metodia.
      Tervehtiva tervehtivaRepolainen = repolainen;
      tervehtivaRepolainen.moikkaa();
   }
}