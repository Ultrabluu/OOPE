package esineet;
/* 
 * Viikkoharjoitus 3, tehtävä 1.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 *  Mallinellaan avainta karkeasti.
 *  
 */

public class Avain extends Esine {
    
    private int avainNro;
    private boolean muovisuus;
    
    @Override
    public boolean equals(Object x) {
       try {
           if (x != null) {              
               if (x.equals("Avain" + muovia() + numero())) {
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
        return getClass().getSimpleName() +  " " + muovia() + " " + numero();
    }
    
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
    
    public int numero()
    {
        return avainNro;
    }
    
    public void setMuovisuus(boolean muovisuus)
    {
        this.muovisuus = muovisuus;
    }
    
    public boolean muovia()
    {
        return muovisuus;
    }
    
}
