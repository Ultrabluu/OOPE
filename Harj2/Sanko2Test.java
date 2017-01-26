/* 
 * Viikkoharjoitus 2, tehtävä 2.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Luodaan Sanko olioita, ja testaillaan näiden metodeja.
 *
 */
public class Sanko2Test {
    
    public static void main (String[] args)
    {
        Sanko2 Sanko2 = new Sanko2();
        Sanko2 Sanko22 = new Sanko2(1, true);
        Sanko2 SankoError = new Sanko2(0.001, true);
        System.out.println(Sanko2.getTilavuus());
        System.out.println(Sanko22.getTilavuus());
        System.out.println(SankoError.getTilavuus());
    }

}
