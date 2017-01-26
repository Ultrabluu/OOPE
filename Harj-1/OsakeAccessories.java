/* 
 * Viikkoharjoitus 1, tehtävä 2.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Muodostetaan olio erillisestä Osake-luokasta, jonka set/get-metodeja
 * käyttäen, asetamme, luemme ja tulostamme osakkeen arvon;
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
