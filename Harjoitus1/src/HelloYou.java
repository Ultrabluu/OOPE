/* 
 * Viikkoharjoitus 6, teht�v� 4.
*/
public class HelloYou {
    // Metodi, joka tervehtii annettua nime�.
    public static void hYou (String nimi)
    {
        System.out.println("Hello "+nimi+"!");
    }
    public static void main (String[] args)
    {
        // Kakkaa.
        System.out.println("Hello! I shall say hello to you.");
        System.out.println("Enter your name:");
        String nimi = In.readString();
        hYou(nimi);
    }
}
