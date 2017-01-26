/* 
 * Viikkoharjoitus 1, teht�v� 5.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Alkuaine.luokka, jossa tiedot ja niiden get+set-metodit.
 *
 */

public class Alkuaine1 {
    
    private String alkuaine;
    private int jarjestysnumero;
    
    // Getterit + setterit START!
    public void setAlkuaine(String alkuaine)
    {
        if(alkuaine != null && alkuaine.length() > 0 && alkuaine.length() <= 3)
        this.alkuaine = alkuaine;
    }
    
    public String getAlkuaine()
    {
        return alkuaine;
    }
    
    public void setJarjestysnumero(int jarjestysnumero)
    {
        if ( jarjestysnumero >= 1 && jarjestysnumero <= 118 )
            this.jarjestysnumero = jarjestysnumero;
    }
    
    public int getJarjestysnumero()
    {
        return jarjestysnumero;
    }
    
    // Getterit + setterit END!

}
