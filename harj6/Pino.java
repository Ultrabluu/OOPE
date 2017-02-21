/*
 * Luento 11.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * M‰‰rittelee liittym‰n abstraktille tietotyypille pino.
 *
 * null-arvoiset alkiot voivat olla joko sallittuja tai kiellettyj‰
 * rajapinnan toteuttavan luokan tarpeiden mukaan.
 *
 */

public interface Pino {
   /*
    * Pinon operaatiot.
    *
    */

   /* Lis‰‰ alkion o pinon p‰‰lle, mik‰li pinoon mahtuu viel‰ 
    * uusi alkio. Paluuarvo on false, jos pino on t‰ynn‰.
    */
   public abstract boolean lisaa(Object o);

   /* Palauttaa ja poistaa pinon p‰‰llimm‰isen alkion, mik‰li pinossa
    * on alkioita. Paluuarvo on null, jos pino on tyhj‰.
    */
   public abstract Object poista();

   /* Palauttaa alkioiden lukum‰‰r‰n (>=0) pinossa.
    */
   public abstract int koko();

   /* Palauttaa totuusarvon true, jos pino on tyhj‰ ja totuusarvon false,
    * jos pinossa on ainakin yksi alkio.
    */
   public abstract boolean onkoTyhja();

   /* Palauttaa pinon p‰‰llimm‰isen alkion sit‰ poistamatta,
    * mik‰li pino ei ole tyhj‰. Paluuarvo on null, jos pino on tyhj‰.
    */
   public abstract Object ylin();
}