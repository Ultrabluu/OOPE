/* 
 * Viikkoharjoitus 5, tehtävä 1.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program that finds out the characteristics of a character.
 *
 */

public class Characters { 
   // Input from the user.
   private static char achar;

   /* Determines if the character is a digit.
    */
   public static boolean isDig(char achar) { 
       // 9 == Digit, getType returnina.
       if(Character.getType(achar) == 9)
           return true;
       else
           return false;
   }

   /* Determines if the character is a lowercase letter.
    */
   public static boolean isLowercaseLetter(char achar) {
      if ((achar >= 'a' && achar <= 'z') || (achar == 'å') || (achar == 'ä') || (achar == 'ö'))
         return true;
      else
         return false;
   }

   /* Determines if the character is a uppercase letter.
    */
   public static boolean isUppercaseLetter(char achar) {
      if ((achar >= 'A' && achar <= 'Z') || (achar == 'Å') || (achar == 'Ä') || (achar == 'Ö'))
         return true;
      else
         return false;
   }

   /* Determines if the character is a letter in the Finnish alphabet.
    */
   public static boolean isLetter(char achar) {
      // Update the attributes.
      isLowercaseLetter(achar);
      isUppercaseLetter(achar);

      // A letter can be a lowercase or an uppercase one.
      if (isLowercaseLetter(achar) || isUppercaseLetter(achar))
         return true;
      else
         return false;
   }

   /* Prints the results to the screen.
    */
   public static void printResults() {
      System.out.println("Character \'" + achar + "\':");
      System.out.println("- " + (isLetter(achar) ? "is not" : "is") + " a number,");
      System.out.println("- " + (isLowercaseLetter(achar) ? "is" : "is not") + " a lowercase letter,");
      System.out.println("- " + (isUppercaseLetter(achar) ? "is" : "is not") + " an uppercase letter and");
      System.out.println("- " + (isLetter(achar) ? "is" : "is not") + " a letter.");
   }

   public static void main(String[] args) {
      // Info to the user.
      System.out.println("Hello! I examine characters.");

      // Read the input.
      achar = In.readChar();

      // Call operations that examine the input.
      isDig(achar);
      isLowercaseLetter(achar);
      isUppercaseLetter(achar);
      isLetter(achar);

      // Print the results.
      printResults();
   } 
}