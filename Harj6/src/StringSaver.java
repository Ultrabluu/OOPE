/*
 * Viikkoharjoitus 6, tehtävä 1.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * Tallennetaan x = userInput kertaa String .txt-filuun.
 * En tiedä miksi operaation täytyy olla tyyppiä boolean, mutta palautellaan true, ihan nyt vain urheilun kannalta.
 *
 */
import java.io.*;

public class StringSaver {
    
    public static int StringAmount()
    {
        int stringAmount = 0;
        do
        {
            System.out.println("Enter the number of strings:");
            stringAmount = In.readInt();
        }while(stringAmount <= 0);
       
        return stringAmount;
    }
    
    public static boolean StringSave(int stringAmount)
    {
        boolean x = true;
        try 
        {
            File linesTxt = new File("lines.txt");
            FileOutputStream outputStream = new FileOutputStream(linesTxt);
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            for (int i = 0; i < stringAmount; i++)
            {
                System.out.println("Enter a string:");
                printWriter.println(In.readString());
            }
            printWriter.close();
        } 
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.print("LUGUVIRHE");
        }
        return x;
    }
    
    public static void main (String[] args)
    {
        System.out.println("Hello! I save strings.");
        int stringAmount = StringAmount();
        boolean x = StringSave(stringAmount);
        
    }

}


