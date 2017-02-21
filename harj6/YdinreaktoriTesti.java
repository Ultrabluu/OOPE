/*
 * Viikkoharjoitus 5, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Ydinreaktorin testeri.
 *
 */

import java.util.Scanner;

public class YdinreaktoriTesti {

    public static void main(String[] args) {
        
        try {       
            Scanner sc = new Scanner(System.in);            
            System.out.println("Hello! I test a nuclear reactor.");
            System.out.println("Please, enter remaining power (%):");
            double tehoPercent = sc.nextDouble();          
            Ydinreaktori ydinreaktori = new Ydinreaktori(tehoPercent);
            if ( ydinreaktori.getTeho() > 0 && ydinreaktori.getTeho() <= 100 ) {                
                System.out.println(ydinreaktori.toString());
            }
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
               
    }

}
