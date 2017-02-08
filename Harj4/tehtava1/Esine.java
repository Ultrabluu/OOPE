package tehtava1;
/* 
 * Viikkoharjoitus 3, teht‰v‰ 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala.
 *
 * Leikit‰‰n abstrakti.luokalla.
 *  
 */

public abstract class Esine   {

    private boolean muovisuus;
    
    // ** LE BUILDAR **
    
    public Esine() {
        muovisuus = true;
    }
    
    public Esine(boolean muovisuus) {
        this.muovisuus = muovisuus;
    }
    
    // ** GET + SET **
    
    public void setMuovisuus(boolean muovisuus)
    {
        this.muovisuus = muovisuus;
    }
    
    public boolean getMuovisuus()
    {
        return muovisuus;
    }
    
    
    
}
