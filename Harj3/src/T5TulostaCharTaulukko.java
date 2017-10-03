/*
     * Viikkoharjoitus 3, teht‰v‰ 4.
     *
     * Lausekielinen ohjelmointi II, syksy 2016.
     *
     * Nuutinen.Raine.m@student.uta.fi
     * 
     * Antaa operaatiolle taulukon ja int-arvon, jossa tarkastaa frekvenssin taulusta annetulla arvolla.
     * 
     * Tulostaa charTaulun merkit erill‰‰n toisistaan.
     * 
     */
public class T5TulostaCharTaulukko {
    
    public static void tulostaTaulukko(char[] charTaulu) 
    {
        String mj = "{ ";
        for (int i = 0; i < charTaulu.length; i++)
        {
            if (charTaulu[i] != 0) // Jos char tyyppinen arvo on null, se palauttaa 0:n. (L‰hd: SO).
            {
            mj = mj + "'" + charTaulu[i] + "'";
            }
        }
        System.out.println(mj + " }");
    }
    
    public static void main (String[] args)
    {
        char[] charTaulu = new char[30];
        tulostaTaulukko(charTaulu);
    }
}
