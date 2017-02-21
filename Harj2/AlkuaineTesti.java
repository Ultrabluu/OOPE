/* 
 * Viikkoharjoitus 2, teht�v� 3.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala.
 *
 * Alkuainetesti.luokka, jossa testaillaan iffi lauseita 
 * rakentajassa.
 *
 */
public class AlkuaineTesti {
    
    public static void main (String[] args)
    {
        System.out.println("Hello! I test elements.");
        System.out.println("Please, enter symbol:");
        String aa = In.readString();
        System.out.println("Please, enter atomic number:");
        int jarjestysnumero = In.readInt();
        Alkuaine alkuaine = new Alkuaine(aa, jarjestysnumero);
       
        System.out.println("State is \"" + alkuaine.getAlkuaine()
            + "\" and " + alkuaine.getJarjestysnumero() + ".");
        
    }

}