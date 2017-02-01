/* 
 * Viikkoharjoitus 3, teht�v� 1.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 *  Mallinellaan avainta karkeasti.
 *  
 */

public class Avain extends Esine {
    
    private int avainNro;
    private boolean muovisuus;
    
    //
    // Le constructors
    //
    
    public Avain()
    {
        super();
        avainNro = 1;        
    }
    
    public Avain(int avainNro, boolean muovisuus)
    {
        if (avainNro >= 0)
            this.avainNro = avainNro;
        
        this.muovisuus = muovisuus;
    }
        
    
    //
    // GET + SET 
    //
    public void setAvainNro(int avainNro)
    {
        if (avainNro >= 1)
            this.avainNro = avainNro;
    }
    
    public int getAvainNro()
    {
        return avainNro;
    }
    
    public void setMuovisuus(boolean muovisuus)
    {
        this.muovisuus = muovisuus;
    }
    
    public boolean getMuovisuus()
    {
        return muovisuus;
    }
    
}
