/* 
 * Viikkoharjoitus 6, tehtävä 3.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.raine.m@student.uta.fi
 *
 * Tulostetaan kasipallon vastaus.
 *
 */
import java.util.concurrent.ThreadLocalRandom;
public class Kasipallo {
    
    public static void vastaus() {
        String vastaus = "";
        int rVastaus = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        if (rVastaus == 1)
            vastaus = "It is certain";
         else if (rVastaus == 2)
            vastaus = "It is decidedly so";
         else if (rVastaus == 3)
            vastaus = "Without a doubt";
         else if (rVastaus == 4)
            vastaus = "Yes, definitely";
         else if (rVastaus == 5)
            vastaus = "You may rely on it";
         else if (rVastaus == 6)
            vastaus = "As I see it, yes";
         else if (rVastaus == 7)
            vastaus = "Most likely";
         else if (rVastaus == 8)
            vastaus = "Outlook good";
         else if (rVastaus == 9)
            vastaus = "Yes";
         else if (rVastaus == 10)
            vastaus = "Signs point to yes";
         else if (rVastaus == 11)
            vastaus = "Reply hazy try again";
         else if (rVastaus == 12)
            vastaus = "Ask again later";
         else if (rVastaus == 13)
            vastaus = "Better not tell you now";
         else if (rVastaus == 14)
            vastaus = "Cannot predict now";
         else if (rVastaus == 15)
            vastaus = "Concentrate and ask again";
         else if (rVastaus == 16)
            vastaus = "Don't count on it";
         else if (rVastaus == 17)
            vastaus = "My reply is no";
         else if (rVastaus == 18)
            vastaus = "My sources say no";
         else if (rVastaus == 19)
            vastaus = "Outlook not so good";
         else if (rVastaus == 20)
            vastaus = "Very doubtful";
        
        System.out.println(vastaus);
    }
    public static void main (String[] args){
        vastaus();
    }
}


