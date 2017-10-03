/*
 * Viikkoharjoitus 1, tehtävä 2.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * randomKortti arpoo satunnaisen kortin x-kertaa parametrin juokseKertaa mukaan.
 *
 */

import java.util.concurrent.ThreadLocalRandom;
public class RandomKortti {
   
    
    public static void randomKortti (int juokseKertaa){
        for (int i = juokseKertaa; i != 0; --i){
            int rNumero = ThreadLocalRandom.current().nextInt(1, 13 + 1);	    
            String[] maat = {"S", "C", "H", "D"};
            System.out.println(rNumero+maat[ThreadLocalRandom.current().nextInt(1, 3 + 1)]);
    }
    }
    
    public static void main (String[] args){
        randomKortti(10);
	
}
}
