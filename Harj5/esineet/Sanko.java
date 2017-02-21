package esineet;

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
    
    public boolean muovisuus;
    
    @Override
    public boolean equals(Object x) {
       try {
           if (x != null) {  
               if (x.equals("Sanko" + muovia() + tilavuus())) {
                   return true; 
           }
           else
               return false;
       }
       }
       catch(Exception e) {
           System.out.println(e);
           return false;
       }
       // Shouldn't go here at all, but compiler requires this return value here, due to if-structure.
       return false;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() +  " " + muovia() + " " + tilavuus();
    }
    
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
        if (muovisuus != vm)
            muovisuus = vm;
            
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