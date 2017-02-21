/*
 * Viikkoharjoitus 5, teht‰v‰ 6.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Luetellun tyypin (enumeration) kokeilua.
 *
 */
public enum Tiedekunta {
    
    JKK("Johtamiskorkeakoulu"), EDU("Kasvatustieteiden tiedekunta"), LUO("Luonnontieteiden tiedekunta"),
    MED("L‰‰keteiteen ja biotieteiden tiedekunta"), COMS("Viestint‰tieteiden tiedekunta"),
    SOC("Yhteiskuntatieteiden tiedekunta");
    
    private String tiedekunta;
    
    Tiedekunta(String newString) throws IllegalArgumentException {
        if (newString == null)
            throw new IllegalArgumentException();
        tiedekunta = newString;
        
    }
    
    

}
