/*
 * Viikkoharjoitus 6, teht�v� 3.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Ydinreaktorin kopioimisrakentajan testeri.
 *
 */
public class YdinreaktoriCopyTest {
    
    public static void main(String[] args) {       
        Ydinreaktori ydin1 = new Ydinreaktori(100);      
        Ydinreaktori ydin2 = new Ydinreaktori(ydin1);
        ydin1.setTeho(50);
        System.out.println(ydin1.toString());
        System.out.println(ydin2.toString());
            
    }
    

}
