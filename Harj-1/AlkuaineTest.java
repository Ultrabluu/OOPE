/* 
 * Viikkoharjoitus 1, teht�v� 5.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Alkuaine.luokka:n testi.luokka.
 *
 */
public class AlkuaineTest {
    
    public static void main(String[] args)
    {
        Alkuaine alkuaineX = new Alkuaine();
        alkuaineX.setAlkuaine("Fe");
        alkuaineX.setJarjestysnumero(26);
        System.out.println(alkuaineX.getAlkuaine());
        System.out.println(alkuaineX.getJarjestysnumero());
    }

}
