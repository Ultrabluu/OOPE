/*
 * Viikkoharjoitus 1, teht‰v‰ 1.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * Trying to say hello to the world.
 *
 */

public class HelloWorld {
   /* Say hello to the world with the words given as a parameter.
    */
   public static void say(String message) {
       System.out.println(message);
   }

   public static void main(String[] args) {
      // Variable for the greeting.
      String message = "Hello World!";

      // Operation call.
      say(message);
   }
}

// Ohjelma ei k‰‰ntynyt, koska operatiokutsulle ei ollut annettu parametri‰ (joka m‰‰rittelee mit‰ tulostetaan).