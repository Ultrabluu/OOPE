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
        Pharah Pharah = new Pharah(false, 0, 0);
        System.out.println("Character name is: " + Pharah.getName());
        System.out.println("And her dps is: " + Pharah.getDps());
        if ( Pharah.getIsNPC() == true ) 
            System.out.print("This Pharah object is a NPC");
        
        else 
            System.out.print("This object is player-controlled");
            
    }

}
