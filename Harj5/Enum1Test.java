/*
 * Viikkoharjoitus 5, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Luetellun tyypin (enumeration) kokeilua - Testiluokka.
 *
 */
public class Enum1Test {
    
    public static void enumtest(Tiedekunta[] tkArray) {
        for(Tiedekunta t : Tiedekunta.values()) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        Tiedekunta[] tkArray = Tiedekunta.values();
        enumtest(tkArray);
        
    }

}
