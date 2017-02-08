
/*
 * Viikkoharjoitus 4, teht�v� 5.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017 Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Luetaan komentoriviparametrina annettu tekstitiedosto Scanner-
 * luokan avulla ArrayList-tyyppiseen kokoelmaan. ArrayList on
 * Vector-luokan tapainen vaihtuvamittainen taulukko. Kokoelman
 * alkioiden tyypiksi kiinnitet��n String, jotta koodi olisi 
 * turvallisempaa.
 *
 */

// Otetaan pakkaukset k�ytt��n.
import java.util.*;
import java.io.*;

public class TiedostonKapistelya {

   /* Luetaan tekstiedoston sis�lt� kokoelmaan. Paluuarvo on viite merkkijonojen
    * muodostamaan kokoelmaolioon. Metodi heitt�� poikkeuksen, jos parametrissa 
    * tai tiedostonk�sittelyss� ilmenee virhe.
    */
   public static ArrayList<String> lueTiedosto(String tiedostonNimi) throws NullPointerException, IOException {
      // Luodaan tiedostoon liittyv� tiedosto-olio.
      File tiedosto = new File(tiedostonNimi);

      // Liistet��n tiedosto-olioon lukija.
      Scanner lukija = new Scanner(tiedosto);

      // Luodaan uusi ArrayList-tyyppinen olio ja liitet��n siihen viite.
      // Huomaa geneeriset m��reet, joilla kokoelman alkoiden tyypiksi 
      // kiinnitet��n String.
      ArrayList<String> rivit = new ArrayList<String>();

      // Luetaan niin kauan kuin l�ytyy uusi tekstirivi.
      while (lukija.hasNext())
         // Lis�t��n kokoelmaan rivi teksti�.
         rivit.add(lukija.nextLine());

      // Palautetaan viite kokoelmaan.
      return rivit;
   }

   /* Tulostaa kokoelmaan tallennetut tekstitiedoston rivit n�yt�lle.
    */
   public static void tulosta(ArrayList<String> rivit) throws NullPointerException {
      // Kokoelmaa voidaan selata my�s for-each-lauseella (for-lauseen variaatio).
      for (String rivi : rivit)
         System.out.println(rivi);
   }

   public static void main(String[] args) {
      // Luetaan tekstitiedoston rivit kokoelmaan. Tiedoston nimi v�litet��n
      // ohjelmalle komentoriviparametrina.
       try {
               ArrayList<String> rivit = lueTiedosto(args[0]);
               // Tulostetaan tiedosto n�yt�lle. 
               tulosta(rivit);
       }
       catch (Exception IOException) {
           System.err.println(IOException);
       }

 
   }
}