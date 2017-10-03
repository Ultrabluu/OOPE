/*
     * Viikkoharjoitus 3, teht‰v‰ 4.
     *
     * Lausekielinen ohjelmointi II, syksy 2016.
     *
     * Nuutinen.Raine.m@student.uta.fi
     * 
     * Antaa operaatiolle taulukon ja int-arvon, jossa tarkastaa frekvenssin taulusta annetulla arvolla.
     * 
     * Muodostaa ja t‰ytt‰‰ charTaulun k‰ytt‰j‰n antamilla arvoilla, jonka j‰lkeen tulostaa sen.
     * 
     */

public class ArrayFiller {
   
    public static void tulostaTaulukko(char[] charTaulu) 
    {
        String mj = "{ ";
        
        for (int i = 0; i < charTaulu.length; i++)
        {
            System.out.println("Enter value:");
            charTaulu[i] = In.readChar();        
        }
        
        for (int i = 0; i < charTaulu.length; i++)
        {
            if (charTaulu[i] != 0) // Jos char tyyppinen arvo on null, se palauttaa 0:n. (L‰hd: SO).
            {
            mj = mj + "'" + charTaulu[i] + "'";
            }            
            if (charTaulu.length > 1 && i < charTaulu.length - 1)
            {
                mj = mj + ", ";
            }
   
        }

        System.out.println(mj + " }");
    }
    
    public static void main (String[] args)
    {
        System.out.println("Hello! I create and fill an array.");
        System.out.println("Please, enter the size of array:");
        int taulunKoko = In.readInt();
        char[] charTaulu = new char[taulunKoko];
        tulostaTaulukko(charTaulu);
    }
}
