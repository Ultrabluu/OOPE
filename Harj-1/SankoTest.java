/* 
 * Viikkoharjoitus 1, tehtävä 4.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Testataan sanko.luokkaa.
 *
 */

public class SankoTest {
    
    public static void main(String[] args)
    {
        Sanko sankoX = new Sanko();
        sankoX.setTilavuus(0.5);
        System.out.println(sankoX.getTilavuus());
    }
    
}
