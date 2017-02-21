/*
 * Viikkoharjoitus 6, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * APIPinon:n testeri.
 *
 */

import java.util.LinkedList;

public class APIPinoTest  {
    
    public static void main(String[] args) {
        APIPino pino = new APIPino(5);
        pino.lisaa(1);
        pino.lisaa(2);
        pino.lisaa(3);
        System.out.println("Onko tyhjä: " + pino.onkoTyhja());
        System.out.println("Pinon koko: " + pino.koko());
        System.out.println("Maxkoko: "    +  pino.maxKoko());
        System.out.println("Pinon ylin: " +  pino.ylin());
        
        while(pino.onkoTyhja() != true) {
            System.out.println(pino.ylin());
            pino.poista();
        }
    }

}
