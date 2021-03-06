/*
 * Viikkoharjoitus 5, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Luetellun tyypin (enumeration) kokeilua.
 *
 */
public enum Tiedekunta {
    
    JKK("Johtamiskorkeakoulu"), EDU("Kasvatustieteiden tiedekunta"), LUO("Luonnontieteiden tiedekunta"),
    MED("Lääketeiteen ja biotieteiden tiedekunta"), COMS("Viestintätieteiden tiedekunta"),
    SOC("Yhteiskuntatieteiden tiedekunta");
    
    private String tiedekunta;
    
    Tiedekunta(String newString) throws IllegalArgumentException {
        if (newString == null)
            throw new IllegalArgumentException();
        tiedekunta = newString;
        
    }
    
    

}
