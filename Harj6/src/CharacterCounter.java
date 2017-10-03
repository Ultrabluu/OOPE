/* 
 * Viikkoharjoitus 5, teht‰v‰ 5.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that counts user given character count from a .txt-file.
 *
 */

import java.io.*;

public class CharacterCounter {
    
    public static int CountCharacters(String fileName, char character)
    {
        int charCount = 0;
        
        try
        {
            BufferedReader bufferedReader = 
                    new BufferedReader(new FileReader(fileName));
            String lineTemp = "";
            
            // Luetaan rivi kerrallaan tiedostoa.
            while ( (lineTemp = bufferedReader.readLine() ) != null )
            {
                // K‰yd‰‰n rivi l‰vitse.
                for (int i = 0; i < lineTemp.length(); i++)
                {
                    //Tallennetaan character osumat countteriin.
                    if (lineTemp.charAt(i) == character)
                    {
                        charCount++;
                    }
                }
                
            }
            bufferedReader.close();   
        }
        catch (Exception ex)
        {
            System.out.println("I could not count.");
            return 0;
        }
        return charCount;
    }

    public static void main (String[] args)
    {
        System.out.println("Hello! I count characters.");
        System.out.println("Please, enter file name:");
        String fileName = In.readString();
        System.out.println("Please, enter character:");
        char character = In.readChar(); 
        int charCount = CountCharacters(fileName, character);
        if (charCount != 0)
        {
            System.out.println("I found " + charCount + " occurrences.");
        }
        
    }

}
