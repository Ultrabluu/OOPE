/* 
 * Viikkoharjoitus 1, teht�v� 6.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 *  Pharah.luokan testeri
 *  Lyhenteit�:
 *  rps = RoundsPerSecond
 *  dps = DamagePerSecond
 */

public class PharahTest {
    
    public static void main(String[] args)
    {
        Pharah Pharah = new Pharah(0, 0);
        System.out.println("Character name is: " + Pharah.getCharacterName());
        System.out.println("And her dps is: " + Pharah.getDps());
    }

}
