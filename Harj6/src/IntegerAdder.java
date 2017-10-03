/* 
 * Viikkoharjoitus 5, tehtävä 3.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that takes numeric values differentiated with ',', from a .txt file
 * and prints the sum of said numbers.
 *
 */
import java.io.*;
public class IntegerAdder {
    
    public static double sumIntegers(String fileName)
    {
        double sum = 0;
        try
        {
            // Aukaistaan tiedostonlukija ja bufferoidaan sen inputti.
            BufferedReader bufferedReader = 
                    new BufferedReader(new FileReader(fileName));
            String lineTemp = "x";
            while (( lineTemp = bufferedReader.readLine()) != null )
            {
               
                for (String palautusArvo: lineTemp.split(","))
                {
                    sum = sum + Double.parseDouble(palautusArvo);
                    
                }
            }
            bufferedReader.close();
        }

        catch(IOException ie)
        {
            ie.printStackTrace();
            System.out.println("I could not add.");
            return 0.0;
        }

        return sum;
    }
    
    public static void main (String[] args)
    {
        System.out.println("Hello! I add integers.");
        System.out.println("Please, enter file name:");
        String fileName = In.readString();
        double summa = sumIntegers(fileName);
        if (!Double.isNaN(summa) && summa != 0.0 )
        {
        System.out.println("Sum is " + summa + ".");
        }
    }
}
