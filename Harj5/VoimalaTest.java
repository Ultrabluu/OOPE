/*
 * Viikkoharjoitus 5, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Testaillaan voimaloita
 *
 */

public class VoimalaTest {
    
    public static void main (String[] args) {
        Voimala voimala = new Voimala(10);
        Voimala voimala2 = new Voimala(15);
        Ydinvoimala yvoimala = new Ydinvoimala(20);
        System.out.println(voimala2.compareTo(voimala));
        System.out.println(yvoimala.compareTo(yvoimala));
        System.out.println(voimala2.compareTo(yvoimala));
       
        
    }

}
