/* 
 * Viikkoharjoitus 2, tehtävä 6.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2017, Jorma Laurikkala.
 *
 * Vaihtaa 2d-taulukon rivien arvot päikseen.
 *
 */

public class ArraySwap {
    
    public static void swapArrays (int[][] array)
    {    
        for (int i2 = 0; i2 < array.length; i2++)
        {
            int temp = 0;
            array[0][i2] = temp;
            array[0][i2] = array[1][i2];
            array[1][i2] = temp;
        }        
    }
    
    public static void main (String[] args)
    {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++)
        {
            for (int i2 = 0; i2 < array.length; i2++)
            {
                array[i][i2] = i2;
            }
        }
        swapArrays(array);
    }

}
