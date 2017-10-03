/* 
 * Viikkoharjoitus 5, tehtävä 6.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that counts user given character count from a .txt-file.
 *
 */

import java.io.*;
public class LineCounter { 
    
    public static int CountLines(String fileName)
    {
        int lineCount = 0;
        try
        {
            BufferedReader bufferedReader = 
                    new BufferedReader(new FileReader(fileName));
            String lineTemp = "";
            
            // Luetaan rivi kerrallaan tiedostoa.
            while ( (lineTemp = bufferedReader.readLine() ) != null )
            {
                lineCount++;
            }
            bufferedReader.close();
        }
        catch (Exception ex)
        {
            System.out.println("I could not count.");
            return -1;
        }
        return lineCount;
    }
    
    
    public static void main (String[] args)
    {
        System.out.println("Hello! I count lines.");
        System.out.println("Please, enter file name:");
        String fileName = In.readString();
        int lineCount = CountLines(fileName);
        if (lineCount >= 0)
        {
            System.out.println("There are " + lineCount + " lines.");
        }
    }
    

}
