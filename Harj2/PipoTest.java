/* 
 * Viikkoharjoitus 2, teht�v� 1.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Pipon testiluokka. Luodaan pipoja ja luetaan pipojen koot
 * metodin kautta toisesta luokasta.
 *
 */

public class PipoTest {
    
    public static void main (String[] args)
    {
        Pipo Pipo = new Pipo();
        Pipo Pipo2 = new Pipo("XL");
        System.out.println(Pipo.equals(Pipo2));
    }

}
