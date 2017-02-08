package tehtava1;

import java.util.concurrent.ThreadLocalRandom;
/* 
 * Viikkoharjoitus 2, tehtävä 2.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Mallinnetaan hyvin yleisellä tasolla sankoa.
 *
 */

public class Sanko extends Esine {
    
    private double tilavuus;
    
    public static final boolean muovisuus = true;
    
    /* 
    *   Le constructoor
    */
    
    public Sanko()
    {
        super();
        tilavuus = ThreadLocalRandom.current().nextDouble(0.1, 10 + 1 );     
    }
    
    public Sanko(double tilavuus, boolean vm)
    {
        if ( tilavuus > 0.1 && tilavuus < 20 )
            this.tilavuus = tilavuus;
    }
    
    public void setTilavuus(double tilavuus)
    {
        if ( tilavuus > 0.1 && tilavuus < 20 )
            this.tilavuus = tilavuus;
    }
    
    public double tilavuus()
    {
        return tilavuus;
    }
    
    public boolean muovia() {
        return muovisuus;
    }
    

    

}