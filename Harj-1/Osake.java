/* 
 * Viikkoharjoitus 1, teht�v� 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Mallinnetaan karkeasti osakeyhti�n yht� osaketta.
 *
 */

public class Osake {

   /* 
    * Attribuutit.
    *
    */

   // Osakkeen arvo euroina.
   private double arvo;

   // Osakkeen liikkeelle laskeneen yhti�n nimi.
   private String yhtio;

   /* 
    * Aksessorit.
    *
    */

   public double arvo() {
      return getArvo();
   }

   public void arvo(double e) {
      if (e >= 0)
         setArvo(e);
   }

   public void yhtio(String nimi) {
      // Tarkistetaan, ett� viitteeseen liittyy merkkijono ja ett� merkkijonossa
      // on v�hint��n yksi merkki. Huomaa ehdollinen AND. Lausekkeen laskenta
      // lopetetaan heti, kun lopputulos on selv�. N�in j�lkimm�ist� ehtoa ei
      // lasketa eik� ohjelma kaadu, kun parametri on null-arvoinen.
      if (nimi != null && nimi.length() > 0)
         yhtio = nimi;
   }

   public String yhtio() {
      return yhtio;
   }

public double getArvo() {
    return arvo;
}

public void setArvo(double arvo) {
    this.arvo = arvo;
}
}