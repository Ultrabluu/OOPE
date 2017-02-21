/* 
 * Viikkoharjoitus 2, tehtävä 3.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Alkuaine.luokka, jossa tiedot ja niiden get+set-metodit.
 *
 */

public class Alkuaine {
    
    private String alkuaine;
    private int jarjestysnumero;
    
    public String toString() {
        String returnString = "State is " + getAlkuaine() + " and " + getJarjestysnumero();
        return returnString;
    }
    
    /*
     * BUILDERRRRRRS
     */
    
    public Alkuaine(String alkuaine, int jarjestysnumero)
    {
        if(alkuaine != null && alkuaine.length() > 0 && alkuaine.length() <= 3)
            this.alkuaine = alkuaine;
        if ( jarjestysnumero >= 1 && jarjestysnumero <= 118 )
            this.jarjestysnumero = jarjestysnumero;
    }
    
   
    
    // Getterit + setterit
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
    

}
