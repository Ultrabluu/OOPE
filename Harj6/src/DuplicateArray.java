/* 
 * Viikkoharjoitus 6, tehtävä 3.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that makes copy of an 2D-integer-array.
 *
 */

public class DuplicateArray {
    
    public static int[][] CopyArray (int[][] array)
    {
      //Luodaan uusi taulukko ja kopioidaan siihen tiedot.
        int duplicateArray[][] = new int[array[1].length][array[2].length];
        try 
        {                        
            for (int i = 0; i < array[0].length; i++)
            {
                for (int i2 = 0; i2 < array[1].length; i2++)
                {
                    duplicateArray[i][i2] = array[i][i2];                    
                }
            }
        }
        // Jos virhe, niin palautetaan null.
        catch (Exception ex)
        {
            return null;
        }
        return duplicateArray;
    }
    
    public static void main (String[] args)
    {
        int[][] array = new int[3][3];
        //Täytetään taulukko numeroilla. 
        for (int i = 0; i < array[1].length; i++)
        {
            for (int i2 = 0; i2 < array[2].length; i2++)
            {
                array[i][i2] = i2;
            }
        }
        int[][] duplicateArray = CopyArray(array);
               
    }

}
