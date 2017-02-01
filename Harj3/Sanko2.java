import java.util.concurrent.ThreadLocalRandom;
/* 
 * Viikkoharjoitus 2, teht�v� 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Mallinnetaan hyvin yleisell� tasolla sankoa.
 *
 */

public class Sanko2 extends Esine {
    
    private double tilavuus;
    
    public static final boolean muovisuus = true;
    
    /* 
    *   Le constructoor
    */
    
    public Sanko2()
    {
        super();
        tilavuus = ThreadLocalRandom.current().nextDouble(0.1, 10 + 1 );     
    }
    
    public Sanko2(double tilavuus, boolean vm)
    {
        if ( tilavuus > 0.1 && tilavuus < 20 )
            this.tilavuus = tilavuus;
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