 /*
     * Viikkoharjoitus 3, teht‰v‰ 4.
     *
     * Lausekielinen ohjelmointi II, syksy 2016.
     *
     * Nuutinen.Raine.m@student.uta.fi
     * 
     * Antaa operaatiolle taulukon ja int-arvon, jossa tarkastaa frekvenssin taulusta annetulla arvolla.
     * 
     * int laskettava ei voi olla null, in luokka est‰‰ t‰m‰n tapahtumasta ja toisekseen
     * sen tyypin pit‰isi olla Integer, jos nullin haluttaisiin olevan mahdollisuus.
     * L‰hde: Stack overflow 80+ accepted post: 
     * http://stackoverflow.com/questions/13747859/how-to-check-if-an-int-is-a-null
     * 
     */

import java.util.Random;

public class T4taulukkoFrekvenssi {
   
    public static int LaskeFrekvenssiTaulusta(int[] intTaulu, int laskettava)
    {
       int frekvenssi = 0;
                     
       for (int i = 0; i < intTaulu.length; i++)
       {
           if (i == laskettava)
           {
               frekvenssi++;
           }
       }
       
       return frekvenssi; 
    }
    
    public static void main (String[] args)
    {
        System.out.print("Anna numero: ");
        int laskettava = In.readInt();
        int[] intTaulu = new int[50];
        
        Random rng = new Random(); // Muodostetaan rng-olio.
        // T‰ytet‰‰n taulu, samalla tulostaen.
        for(int i = 0; i < intTaulu.length; i++)
        {
            intTaulu[i] = rng.nextInt(11);
            System.out.println(intTaulu[i]);
            
        }
        //Ja tulostellaan frekvenssi.
        System.out.println ( "Osumia on: " + LaskeFrekvenssiTaulusta(intTaulu, laskettava) );

    }
}
