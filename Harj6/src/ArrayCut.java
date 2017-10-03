/* 
 * Viikkoharjoitus 6, tehtävä 4.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that copies an array, and deleted [0] of it, and returns
 * reference to said array.
 *
 */

public class ArrayCut {
    
    public static int[] CutArray (int[] array)
    {       
        int cutArray[] = new int[array.length-1];
        
        try 
        {   
            // Kopioidaan taulukko, pl. [0]
            for (int i = 0; i < array.length-1; i++)
            {                
                cutArray[i] = array[i+1];                                    
            }
            
        }
        // Palautetaan null, jos osoitellaan tyhjyyteen.
        catch (Exception NullPointerException)
        {
            return null;
        }
        //Palautetaan leikattu taulukko.   
        return cutArray;
    }
    
    public static void main (String[] args)
    {
        int array[] = new int[5];
        //Täytetään taulukko numeroilla. 
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        // Taulukko viittaa leikattuun taulukkoon.
        array = CutArray(array);

    }

}
