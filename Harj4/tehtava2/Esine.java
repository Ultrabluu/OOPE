package tehtava2;
/* 
 * Viikkoharjoitus 3, teht‰v‰ 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala.
 *
 * Leikit‰‰n abstrakti.luokalla.
 *  
 */

public abstract class Esine implements Rikkoutuva   {

    private boolean muovisuus;
    protected boolean rikkoutuneisuus;
    
    // ++ LE BUILDAR ++ \\
    
    public Esine() {
        muovisuus = true;
        rikkoutuneisuus = false;
    }
    
    public Esine(boolean muovisuus) {
        this.muovisuus = muovisuus;
        rikkoutuneisuus = false;
    }
    
    // -- LE BUILDAR -- \\
    // ++ GET + SET ++ \\
    
    public void setMuovisuus(boolean muovisuus)
    {
        this.muovisuus = muovisuus;
    }
    
    public boolean getMuovisuus()
    {
        return muovisuus;
    }
    
    // -- GET + SET -- \\
    // ++ METHODS ++ \\

    public void rikkoudu() {        
        rikkoutuneisuus = true;
    }
    
    public void korjaudu() {        
        rikkoutuneisuus = false;
    }
    
    public boolean onkoRikki() {
        return rikkoutuneisuus;
    }
    
    
    
}
