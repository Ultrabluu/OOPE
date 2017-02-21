/*
 * Viikkoharjoitus 6, tehtävä 6.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Toteuttaa abstraktin pinoluokan; pinotietorakennelman.
 *
 */

import java.util.LinkedList;

public class APIPino extends AbstraktiPino {
    
    private int maxKoko;
    private int pinoLen = 0;
    private LinkedList<Object> alkiot;
    
    public APIPino(int m) {
        super(m);
        alkiot = new LinkedList<Object>();         
     }
    
    public boolean lisaa(Object o) {
        if(pinoLen < maxKoko()) {
            alkiot.add(o);
            pinoLen++;
            return true;
        } else { return false; }       
    }
    
    public Object poista() {
        if(pinoLen != 0) {
            alkiot.removeLast();
            pinoLen--;
            return true;
        } else { return null; }
    }

     public int koko() {
         return pinoLen; 
         }
      
     

     public boolean onkoTyhja() {
        if(pinoLen == 0) {
            return true;
        } else { return false; }
     }

     public Object ylin() {
         if(pinoLen > 0) {
             return alkiot.getLast();
         }else { return null; }
     }

}
