/* 
 * Viikkoharjoitus 1, teht�v� 3.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Mallinnetaan hyvin yleisell� tasolla oppilaitosta.
 *
 */

public class Oppilaitos {

   /* 
    * Tyylilaji-attribuutin sallitut arvot julkisina vakioina.
    *
    * Vakiot on esitelty public-m��reell�, koska niist� voi olla hy�ty�
    * luokan ulkopuolella. Esittelyss� on k�ytetty static-m��rett�,
    * jolla vakiot saadaan k�ytt��n nopeasti ilman oliota.
    *
    */

   // Esikoulu.
   public static final int ESIASTE = 0;

   // Peruskoulu.
   public static final int PERUSASTE = 1;

   // Lukio ja ammattikoulu.
   public static final int TOINENASTE = 2;

   // Yliopisto ja ammattikorkeakoulu.
   public static final int KORKEAASTE = 3;

   /* 
    * Attribuutit.
    *
    */

   // Oppilaitoksen opiskelijoiden lukum��r�.
   private int opiskelijoita;

   // Oppilaitoksen aste.
   private int aste;

   /* 
    * Aksessorit.
    *
    */
   
   public void setOpiskelijoita(int opiskelijoita)
   {
       if (opiskelijoita > -1)       
       this.opiskelijoita = opiskelijoita;              
   }
   
   public void setAste(int aste)
   {
       if (aste > -1 && aste <= 3)
       this.aste = aste;
   }
   
   public int getOpiskelijoita()
   {
       return opiskelijoita;
   }
   
   public int getAste()
   {
       return aste;
   }
      
   
}