import java.util.ArrayList;

/*
 * Viikkoharjoitus 5, tehtävä 5.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * countIntegers([ArrayList]) 
 *  -> Laskee Integer objektit.
 *
 */

public class Arraylist {
    
    public static int countIntegers(ArrayList<Integer> alist) {               
        if (alist.isEmpty())
            throw new IllegalArgumentException();
        int counter = 0;
        for (int i : alist ) {
            counter++;
        }
        return counter;
    }

    
    
    public static void main (String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Integer ii = new Integer(i);
            alist.add(ii);
        }
        System.out.println(countIntegers(alist));
    }

}
