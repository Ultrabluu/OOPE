import java.util.concurrent.ThreadLocalRandom;
/* 
 * Viikkoharjoitus 1, tehtävä 4.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Mallinnetaan hyvin yleisellä tasolla sankoa.
 *
 */

public class Sanko {
    
    private double tilavuus;
    
    public static final boolean valmistusmateriaaliMuovi = true;
    
    /* 
    *   Le constructoor
    */
    
    public Sanko()
    {
        tilavuus = ThreadLocalRandom.current().nextDouble(0.1, 10 + 1 );
    }
    
    public void setTilavuus(double tilavuus)
    {
        if ( tilavuus > 0.1 && tilavuus < 20 )
            this.tilavuus = tilavuus;
    }
    
    public double getTilavuus()
    {
        return tilavuus;
    }
    

}
