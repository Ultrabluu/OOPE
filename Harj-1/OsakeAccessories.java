/* 
 * Viikkoharjoitus 1, teht�v� 2.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Muodostetaan olio erillisest� Osake-luokasta, jonka set/get-metodeja
 * k�ytt�en, asetamme, luemme ja tulostamme osakkeen arvon;
 * Olio/kapsulointi-harjoitus.
 * 
 */

public class OsakeAccessories {
     
    public static void main (String[] args)
    {
        Osake osakeX = new Osake();
        osakeX.yhtio("X");
        osakeX.setArvo(100);
        System.out.println(osakeX.getArvo());
        System.out.println(osakeX.yhtio());
    }

}
