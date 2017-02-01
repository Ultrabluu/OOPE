/*
 * Viikkoharjoitus 3, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Kettua testaava luokka, jota EI OLE SYYTÄ MUUTTAA MILLÄÄN TAVALLA,
 * koska WETO käyttää aina tämän luokan alkuperäistä versiota.
 *
 */

public class KettuTesti {
   public static void main(String[] args) {
      // Esitellään viite, luodaan olio ja alustetaan se ja liitetään olioon viite.
      Kettu repolainen = new Kettu();
      System.out.println(repolainen.elossa());        // true
      System.out.println(repolainen.paino());         // 5.0
      System.out.println(repolainen.turkillinen());   // true
      System.out.println(repolainen.onkoIso());       // false

      // Vapaavalintaisesti kuvailtua syömistä ja tervehtimistä.
      repolainen.syo();
      repolainen.moikkaa();

      // Testataan vielä kierrommin ja tutustutaan samalla lisää rajapintoihin.
      // Kettu toteuttaa Tervehtiva-rajapinnan ja on siten myös Tervehtiva-tyyppiä.
      // Liitetään olioon esimerkinomaisesti Tervehtiva-viite ja kutsutaan sen
      // kautta rajapinnan toteutettua metodia.
      Tervehtiva tervehtivaRepolainen = repolainen;
      tervehtivaRepolainen.moikkaa();
   }
}