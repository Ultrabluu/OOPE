package esineet;
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
    
    @Override
    public boolean equals(Object x) {
       try {
           if (x != null) {              
               if (x.equals("Avain" + muovia())) {
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
        return getClass().getSimpleName() +  " " + muovia();
    }
    
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
    
    public boolean muovia()
    {
        return muovisuus;
    }
    
    
    
}
