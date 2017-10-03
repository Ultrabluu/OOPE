/* 
 * Viikkoharjoitus 6, tehtävä 5.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that sums values of 1D-Integer-array of 
 * user given values and length.
 *
 */

public class IterativeAdder {
    
    public static double SumIntegersToDouble (int[] intArray)
    {
        //Summaa taulukon arvot ja palauttaa sen.
        double d = 0.0;
        
        for (int i = 0; i < intArray.length; i++)
        {
            d = d + intArray[i];
        }
        
        return d;
    }
    
    public static int[] FillArray (int[] intArray)
    {
        // Täyttää taulukon käyttäjän antamilla arvoilla.
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println("Enter value:");
            intArray[i] = In.readInt();
        }
        return intArray;
    }
    
    public static void main (String[] args)
    {
        //Heimoi, kyselyt ja taulukon muodostus ja täyttö.
        System.out.println("Hello! I add array element values.");
        System.out.println("Please, enter the size of array:");
        int arrayLength = In.readInt();
        int[] intArray = new int[arrayLength];
        
        intArray = FillArray(intArray);
        double sum = SumIntegersToDouble(intArray);
        System.out.println("Sum is " + (int)sum + ".");
    }

}
