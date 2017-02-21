/*
 * Viikkoharjoitus 6, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Omalistan testeri.
 *
 */

import fi.uta.csjola.oope.lista.*;

public class OmalistaTest extends LinkitettyLista      {
    
    public static void main(String[] args) {
        // public boolean vaihdaEkaJaVika() {
         OmaLista ll = new OmaLista();
         ll.lisaaLoppuun(1);
         ll.lisaaLoppuun(2);
         ll.lisaaLoppuun(3);
         System.out.println(ll.alkio(0));
         System.out.println(ll.alkio(1));
         System.out.println(ll.alkio(2));
         System.out.println( ll.vaihdaEkaJaVika() );
         System.out.println(ll.alkio(0));
         System.out.println(ll.alkio(1));
         System.out.println(ll.alkio(2));
         
         //  public Object[] taulukkoon(OmaLista ol) {
         Object[] objTaulu = ll.taulukkoon(ll);
         for (int i = 0; i < objTaulu.length; i++) {
             System.out.println(objTaulu[i]);
         }
         
         
    }

}
