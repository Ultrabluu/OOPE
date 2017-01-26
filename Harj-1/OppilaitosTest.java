/* 
 * Viikkoharjoitus 1, tehtävä 3.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala
 *
 * Luodaan Oppilaitos luokasta olio, jonka kautta käytämme oppilaitoksen
 * metodeja.
 *
 */

public class OppilaitosTest {
    
    public static void main(String[] args)
    {
        Oppilaitos oppilaitosX = new Oppilaitos();
        oppilaitosX.setAste(0);
        oppilaitosX.setOpiskelijoita(1);
        System.out.println(oppilaitosX.getAste());
        System.out.println(oppilaitosX.getOpiskelijoita());
    }
    
}
