/* 
 * Viikkoharjoitus 2, teht‰v‰ 4.
 *  
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala.
 *
 * P‰‰mies.luokka, jossa on yksi boolean arvoinen attribuutti,
 * jolle on get+set ja 2 0+1 param-builderit.
 *
 */
public class Valtionpaamies {
    
    private boolean valittu = true;
    
    public Valtionpaamies()
    {
        valittu = true;
    }
    
    public Valtionpaamies(boolean valittu)
    {
        this.valittu = valittu;
    }
    
    public void setValittu (boolean valittu)
    {
        this.valittu = valittu;
    }
    
    public boolean getValittu()
    {
        return valittu;
    }
    
}
