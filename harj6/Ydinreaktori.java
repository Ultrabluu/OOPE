/*
 * Viikkoharjoitus 6, tehtävä 1.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Konkreettinen ydinreaktoria mallintava luokka.
 *
 */

public class Ydinreaktori  {
   // extends Voimala
    
    private double teho;

    // Builders \\
    
    
    public Ydinreaktori(double teho) throws IllegalArgumentException {
        //super(teho); 
        setTeho(teho);
    }
    
    public Ydinreaktori(Ydinreaktori ydinreaktori) throws 
    IllegalArgumentException {
        //super(ydinreaktori.teho()); 
        setTeho(ydinreaktori.getTeho());                  
   }
    
    // Set + Get \\
    public void setTeho(double teho) throws IllegalArgumentException {
        if(teho > 0 && teho <= 100) {
            this.teho = teho;
        }
        else { throw new IllegalArgumentException("Error!");}
    }
    public double getTeho() {
        return teho;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getTeho() + " %";
    }
    
}
