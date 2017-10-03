/*
 * Viikkoharjoitus 7, teht�v� 4.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Yhtyeell� on vuosi ja kappaleidenLkm.
 *
 */

public class Levy extends Yhtye {
    //KOMMENTTI
    private Integer vuosi;
    private Integer kappaleidenLkm;

    public Levy(String nimi, Integer vuosi, Integer kappaleidenLkm) {
        super(nimi);
        this.vuosi = vuosi;
        this.kappaleidenLkm = kappaleidenLkm;
    }
    
    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
    
    public Integer getVuosi() {
        return vuosi;
    }
    
    public void setKappaleidenLkm(Integer kappaleidenLkm) {
        this.kappaleidenLkm = kappaleidenLkm;
    }
    
    public Integer getKappaleidenLkm() {
        return kappaleidenLkm;
    }
}
