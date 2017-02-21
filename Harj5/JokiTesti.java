// Otetaan k‰yttˆˆn reflektoivia palveluja.
import java.lang.reflect.*;

/* 
 * Viikkoharjoitus 5, teht‰v‰ 7.
 *  
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala.
 *
 * Jokea mallintavaa luokkaa testaava luokka, jota EI OLE SYYTƒ MUUTTAA
 * MILLƒƒN TAVALLA, koska WETO k‰ytt‰‰ aina t‰m‰n luokan alkuper‰ist‰ versiota.
 *
 */

public class JokiTesti {
   public static void main(String[] args) {
      try {
         // Tutkitaan reflektiolla onko ongelma korjattu oikein. Ongelman luonne
         // selvi‰‰ jo alla olevasta koodista, jos tunnet reflektion. Helpointa
         // on kuitenkin tunnistaa ongelma testattavaa luokkaa tutkimalla.
         Class<?> meta = Class.forName("Joki");
         Method metodi = meta.getDeclaredMethod("equals", Object.class);
      }
      catch (NoSuchMethodException e) {
         // T‰m‰n pit‰isi tulostua niin pitk‰‰n kuin virhe on korjamatta.
         System.out.println("Joki on rikki!");
      }
      catch (Exception e) {
         // Viestit‰‰n odottamattomasta ongelmasta.
         System.out.println("Vastuuopettaja k‰pelisi!");
         e.printStackTrace(System.out);
      }

      // Esitell‰‰n viite, luodaan olio ja alustetaan se annetuilla arvoilla
      // sek‰ liitet‰‰n viite olioon. Huomaa, ett‰ Niilin ja Amazonin
      // pituuksista esitell‰‰n eri l‰hteiss‰ vaihtelevia tietoja.
      Object niili = new Joki(6550, "Afrikka");
      Object niili2 = new Joki(6550, "Afrikka");
      Object amazon = new Joki(6437, "Etel‰-Amerikka");
      Object virta = new String("~~~~~~~");

      // Vertaillaan jokia equals-metodilla.       // Oikeat tulokset.
      System.out.println(niili.equals(niili));     // true
      System.out.println(niili2.equals(niili2));   // true
      System.out.println(amazon.equals(amazon));   // true
      System.out.println(niili.equals(amazon));    // false
      System.out.println(amazon.equals(niili));    // false
      System.out.println(niili.equals(niili2));    // true
      System.out.println(niili2.equals(niili));    // true
      System.out.println(niili.equals(null));      // false
      System.out.println(niili.equals(virta));     // false
   }
}