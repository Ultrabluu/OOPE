/* 
 * Viikkoharjoitus 1, teht�v� 3.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala
 *
 * Luodaan Oppilaitos luokasta olio, jonka kautta k�yt�mme oppilaitoksen
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
