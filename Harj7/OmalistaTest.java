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

    public static void vaihdaEkaJaVikaTest() {
        OmaLista ll = new OmaLista();
        ll.lisaaLoppuun(1);
        ll.lisaaLoppuun(2);
        ll.lisaaLoppuun(3);
        System.out.println(ll.alkio(0));
        System.out.println(ll.alkio(1));
        System.out.println(ll.alkio(2));
        System.out.println(ll.vaihdaEkaJaVika() );
        System.out.println(ll.alkio(0));
        System.out.println(ll.alkio(1));
        System.out.println(ll.alkio(2));
    }
    
    //  public Object[] taulukkoon(OmaLista ol) {
    public static void taulukkoonTest() {
        OmaLista ll = new OmaLista();
        ll.lisaaLoppuun(1);
        ll.lisaaLoppuun(2);
        ll.lisaaLoppuun(3);
        Object[] objTaulu = ll.taulukkoon(ll);
        for (int i = 0; i < objTaulu.length; i++) {
            System.out.println(objTaulu[i]);
        }
    }
    
    public static void karsiTest() {
        OmaLista ll = new OmaLista();
        ll.lisaaLoppuun(1);
        ll.lisaaLoppuun(2);
        ll.lisaaLoppuun(3);
        ll.lisaaLoppuun(null);
        System.out.println(ll.karsi());
    }
    
    public static void haeTest() {
        OmaLista ll = new OmaLista();
        ll.lisaaLoppuun(2);
        ll.lisaaLoppuun(1);
        ll.lisaaLoppuun(1);
        ll.lisaaLoppuun(3);  
        ll.lisaaLoppuun(1);
        int[] indexit = ll.hae(1);
        for (int i = 0; i < indexit.length; i++) {
            System.out.println(indexit[i]);
        }
    }

        public static void haeSuurinTest() {
            OmaLista ll = new OmaLista();
            ll.lisaaLoppuun(new Integer(1));
            ll.lisaaLoppuun(new Integer(2));
            ll.lisaaLoppuun(new Integer(3));
            System.out.println(ll.haeSuurin());
        }
        
    
    public static void main(String[] args) {
        haeSuurinTest();
    }

}
