/*
 * Viikkoharjoitus 7, teht�v� 4.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Yhtyeell� on nimi.
 *
 */

public class Yhtye {
    
    private String nimi;
    
    public Yhtye(String nimi) {
        this.nimi = nimi;
    }
    
    public void setNimi(String nimi) {
        if (nimi == null) {
            System.out.println("Error");
        }
        else {
            this.nimi = nimi;
        }
    }
    
    public String getNimi() {
        return nimi;
    }
    
 
}
