/*
 * Viikkoharjoitus 1, tehtävä 7.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * Tutkii, kuinka moni ensimmäisen merkkijonon merkki - esiintyy toisessa merkkijonossa
 *
 */
public class Occurrences {
    public static void mjLaskeFrekvenssi(String mj0, String mj1)
    {
        int frekvenssi = 0;
        int mj0Pituus = mj0.length();
        int mj1Pituus = mj1.length();
        
        for (int i0 = 0; i0 < mj0Pituus; i0++) {
            char merkki0 = mj0.charAt(i0);
            
            boolean eiOsumaa = true;
            int i1 = 0;
            
            while (i1 < mj1Pituus && eiOsumaa) {
                char merkki1 = mj1.charAt(i1);
                
                if (merkki0 == merkki1) {
                   eiOsumaa = false;
                   frekvenssi++;
                }
                i1++;
             }
          }
        System.out.println("The number of occurrences is " + frekvenssi + ".");
        }
    public static void main (String[] args)
    {
        System.out.println("Hello! I count character occurrences between strings.");
        System.out.println("Enter the first string:");
        String mj0 = In.readString();
        System.out.println("Enter the second string:");
        String mj1 = In.readString();
        mjLaskeFrekvenssi(mj0, mj1);
    }
}
   

