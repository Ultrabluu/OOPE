/* 
 * Viikkoharjoitus 6, teht‰v‰ 2.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that reverses .txt-file's words.
 *
 */

import java.io.*;

public class LineReverser {
    //
    public static boolean ReverseLines(String fileName)
    {
        String words[] = new String[20];
        int wordsIndex = 0;
        
        try
        {
            BufferedReader bufferedReader = 
                    new BufferedReader(new FileReader(fileName));

            String lineTemp = "";
            String lineTemp2 = "";
            //Luetaan rivi kerrallaan .txt tiedostosta.
            while ( (lineTemp = bufferedReader.readLine() ) != null )
            {
                //K‰yd‰‰n rivi l‰vitse ja k‰‰nnet‰‰n se.
                for (int i = 0; i < lineTemp.length(); i++)
                {
                    lineTemp2 = lineTemp2 + lineTemp.charAt(lineTemp.length()-i-1);                
                }
                //Tallennetaan rivi taulukkoon.
                words[wordsIndex] = lineTemp2;
                lineTemp2 = "";
                wordsIndex++;
                
            }
            bufferedReader.close();
            

            //Tallennus osio.
            BufferedWriter bufferedWriter = 
                    new BufferedWriter(new FileWriter(fileName));
            //Tallennellaan taulukosta .txt filuun.
            for (int i = 0; i < wordsIndex; i++)
            {
                bufferedWriter.write(words[i]);
                bufferedWriter.newLine();

            }
            System.out.println("File reversed.");
            
            bufferedWriter.close();
        }
        catch(Exception ex)
        {
            System.out.println("I could not reverse.");
            return false;
        }
                
        return true;
        
    }
    
    public static void main (String[] args)
    {
       
        System.out.println("Hello! I reverse files.");
        System.out.println("Please, enter file name:");
        String fileName = In.readString();
        boolean ReverseLinesBoolean = ReverseLines(fileName);        
    }
}
