// Otetaan k‰yttˆˆn lista-pakkauksen luokat.
import fi.uta.csjola.oope.lista.*;

/*
 * Luento 11.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Pino-rajapinnan t‰ydellinen toteutus konkreettisessa luokassa.
 *
 * Pinon koolle asetetaan yl‰raja.
 *
 */

public class LinkitettyPino extends AbstraktiPino {
   /*
    * Attribuutit.
    *
    */

   // Tietorakenne alkioiden tallentamiseen.
   private LinkitettyLista lista;

   /*
    * Rakentajat.
    *
    */

   public LinkitettyPino(int m) {
      super(m);
      lista = new LinkitettyLista();
   }

   /*
    * Pinon operaatioiden kunnollinen korvaus.
    *
    */

   /* Lis‰‰ alkion o pinon p‰‰lle, mik‰li pinoon mahtuu viel‰ 
    * uusi alkio. Paluuarvo on false, jos pino on t‰ynn‰.
    */
   public boolean lisaa(Object o) {
      if (koko() < maxKoko()) {
         // Listan alku vastaa pinon p‰‰llyst‰.
         lista.lisaaAlkuun(o);
         return true;
      }
      else
         return false;
   }

   /* Palauttaa ja poistaa pinon p‰‰llimm‰isen alkion, mik‰li pinossa
    * on alkioita. Paluuarvo on null, jos pino on tyhj‰.
    */
   public Object poista() {
      // Listan alku vastaa pinon p‰‰llyst‰.
      return lista.poistaAlusta();
   }

   /* Palauttaa alkioiden lukum‰‰r‰n (>=0) pinossa.
    */
   public int koko() {
      return lista.koko();
   }
   
   /* Palauttaa totuusarvon true, jos pino on tyhj‰ ja totuusarvon false,
    * jos pinossa on ainakin yksi alkio.
    */
   public boolean onkoTyhja() {
      return lista.onkoTyhja();
   }

   /* Palauttaa pinon p‰‰llimm‰isen alkion sit‰ poistamatta,
    * mik‰li pino ei ole tyhj‰. Paluuarvo on null, jos pino on tyhj‰.
    */
   public Object ylin() {
      // Listan alku vastaa pinon p‰‰llyst‰.
      return lista.alkio(0);
   }

   /*
    * Object-luokan metodien korvaukset.
    *
    */
   
   /* Muodostetaan pinon merkkijonoesitys.
    */
   public String toString() {
      // Pinon reuna.
      final String REUNA = "-----";

      // Lis‰t‰‰n yl‰reuna.
      String pinoMerkkijonona = "|" + REUNA + ">\n";

      // Lis‰t‰‰n alkiot merkkijonoon rivinvaihdolla erotettuina.
      for (int i = 0; i < koko(); i++)
         pinoMerkkijonona += lista.alkio(i) + "\n";

      // Lis‰t‰‰n alareuna.
      pinoMerkkijonona += "<" + REUNA + "|";

      // Palautetaan merkkijono.
      return pinoMerkkijonona;
   }
}