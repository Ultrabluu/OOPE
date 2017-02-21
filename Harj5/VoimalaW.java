/*
 * Viikkoharjoitus 5, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen voimalaa mallintava luokka.
 *
 */

public class VoimalaW implements Comparable<Voimala> {

   /*
    * Attribuutit.
    *
    */

   // Voimalan teho megawatteina.
   private double teho;
   
   @Override
   public int compareTo(Voimala voimala) {
           if (teho() < voimala.teho) 
               return 1;
           
           if (teho() > voimala.teho)
               return -1;
       return 0;
   }   
   
   @Override
   public String toString() {
       return getClass().getSimpleName() + " " +teho();
   }

   /*
    * Rakentajat.
    *
    */

   public Voimala(double mw) {
      teho(mw);
   }
   

   /*
    * Aksessorit.
    *
    */

   public double teho() {
      return teho;
   }

   public void teho(double mw) {
      if (mw >= 0)
         teho = mw;
   }

   /*
    * Oliometodit.
    *
    */

   public void hajoa() {
       
      System.out.println("Poks!");
   }
   
   public void hajoa(double tn) {
       // Muuttuja saa true-arvon metodille parametrina annetulla
       // todennäköisyydellä tn.
       boolean hajoa = Math.random() < tn / 100;
       if (hajoa == true)
           hajoa();
   }


}

