/*
 * Viikkoharjoitus 6, teht‰v‰ 4.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Yksi metodi lis‰‰ linkitettyyn listaan.
 *
 */

import fi.uta.csjola.oope.lista.*;

public class OmaLista extends LinkitettyLista {
    
    public OmaLista() {
        super();
    }
        
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
    
}
