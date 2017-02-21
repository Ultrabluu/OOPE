import esineet.*;
/* 
 * Viikkoharjoitus 5, tehtävä 3.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 *  Testaillaan @Overridettyjä object.equals ja object.toString metodeja.
 *  
 */

public class EsineetTest {
    public static void main(String[] args) {
        Avain Avain = new Avain(1, true);
        Avain Avain2 = new Avain(2, true);
        Sanko Sanko = new Sanko(1, false);
        Sanko Sanko2 = new Sanko(1, true);
        System.out.println(Sanko.muovia());
        System.out.println(Sanko2.muovia());
        System.out.println(Sanko.equals(Sanko2));
        
        
        
    }
}
