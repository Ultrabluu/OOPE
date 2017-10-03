/*
 * Viikkoharjoitus 6, teht‰v‰ 4.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Lis‰‰ toimintoja LinkitettyynListaan.
 *
 */

import fi.uta.csjola.oope.lista.*;

public class OmaLista extends LinkitettyLista  {
    
    public OmaLista() {
        super();
    }
    // Vaihtaa ensimm‰isen ja viimeisen alkion p‰ikseen.     
    public boolean vaihdaEkaJaVika() {
        try {
            if(paa() == null)
                return false;
            else {
                korvaa(koko-1, korvaa(0, alkio(koko-1)));                    
                return true;
            }
            }
            catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    // Palauttaa ObjektiTaulukon linkitetyst‰Listasta.
    public Object[] taulukkoon(OmaLista ol) {
        Object[] objTaulu = new Object[koko];
        for (int i = 0; i < objTaulu.length; i++) {
            objTaulu[i] = ol.alkio(i);
        }
        if(objTaulu.length != 0) {
            return objTaulu; 
            }
        else {  
            return null;
        }
    }
    
    // Poistaa Linkitetyst‰Listasta null-alkiot ja palauttaa   
    // n‰iden tapahtukertojen summan.    
    public int karsi () {
        int nullLaskuri = 0;
        int kertaa = koko();
        for (int i = 0; i < kertaa; i++) {
            
            if (i == 0) {                
               if (hanta() == null) {
                  poistaLopusta();
                  nullLaskuri++;                   
                  i--;
                  kertaa--;
               }
            }
            
            if(alkio(i) == null) {
                poista(i);
                nullLaskuri++;
                i--;
                kertaa--;
            }
            
        }
        if (nullLaskuri == 0) {
            return 0;
        } else {return nullLaskuri;}

    }
    
    // Palauttaa int[], jossa on haettavan objectin osumat
    // linkitetynListan indeksein‰.
    public int[] hae(Object haettava) {
        if (haettava == null) {
            return null;
        }
        int osumaLaskuri = 0;
        int indeksiLaskuri = 0;
        for (int i = koko()-1; i > -1; i--) {
            if (alkio(i).equals(haettava)) {
                osumaLaskuri++;
            }
        }
        if (osumaLaskuri == 0) {
            return null;
        }
        int[] osumienIndeksit = new int[osumaLaskuri];
        for (int i2 = koko()-1; i2 > -1; i2--) {
            if (alkio(i2).equals(haettava)) {
                osumienIndeksit[indeksiLaskuri] = i2;
                indeksiLaskuri++;
            }
            }
        
        return osumienIndeksit;
                    
        
    }   
    // Palauttaa suurimman arvon. Onkhelmia tyyppimuunnoksen kanssa
    public Object haeSuurin() {
        Comparable vertailtava = (Comparable)alkio(0);
        for (int i = 1; i < koko()-1; i++) {
            if(vertailtava.compareTo(alkio(i)) == 1) {
                vertailtava = (Comparable)alkio(i);
            }
        }
        return vertailtava;
    }
  

}
