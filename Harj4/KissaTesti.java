import tehtava3.*;
/*
 * Tehtäväpaketti 4 - T3
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Kissa.luokan testailua.
 *
 */


public class KissaTesti {
    
    public static void main(String[] args) {
    Kissa Kise = new Kissa();
    Kissa IsoKise = new Kissa(true, 80, "musta", "perse");
    String s = "";
    Kissa y = null;
    
    Kise.moikkaa(Kise);
    Kise.moikkaa(IsoKise);
    Kise.moikkaa(s);
    Kise.moikkaa(y);
    
    }
    
    
}
