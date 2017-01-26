/* 
 * Viikkoharjoitus 2, tehtävä 5.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Pressa luokka, perii/extendaa-harjoitus.
 *
 */

public class Presidentti extends Valtionpaamies {

    private int kausienLkm = 0;
    
    public void setKausienLkm(int kausienLkm)
    {
        if (kausienLkm >= 1)
            this.kausienLkm = kausienLkm;
    }
    
    public int getKausienLkm()
    {
        return kausienLkm;
    }
    
    
    
}
