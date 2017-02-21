/*
 * Viikkoharjoitus 5, tehtävä 4.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Ydinvoimalan testeri.
 *
 */

import java.util.Scanner;

public class YdinvoimalaTesti {
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello! I test a nuclear power plant.");
            System.out.println("Please, enter power (MW):");
            int mw = sc.nextInt();
            System.out.println("Please, enter remaining power");
            double pw = sc.nextDouble();
            Ydinvoimala ydinvoimala = new Ydinvoimala(mw);
            ydinvoimala.jaljella(pw);
            System.out.println(ydinvoimala.toString());
           
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }

}
