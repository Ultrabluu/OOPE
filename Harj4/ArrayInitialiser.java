/*
 * Viikkoharjoitus 4, teht‰v‰ 6.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2017, Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Ottaa 2d-taulukon parametrin‰, jonka t‰ytt‰‰ charactereilla siten, ett‰
 * yht‰ saraketta lukuunottamatta, taulukko on t‰ynn‰ merkki‰-x, viimeinen 
 * sarake t‰ytet‰‰n merkki-y:ll‰.
 *
 */

   // Fills and prints the array.
public class ArrayInitialiser {
    // METODIT \\
 
    public static void workArray(char[][] array2d, char charX, char charY, int YIndex)
            throws IllegalArgumentException {
        try {
            
        // K‰yd‰‰n taulukko l‰vitse, t‰ytt‰en se parametrien mukaan.
        for (int i = 0; i < array2d.length; i++) {
            // Vaihdetaan rivi‰, jos ei ole eka kiekka.
            if (i != 0)
                System.out.println("");
            //T‰ytell‰‰n ja tulostellaan merkki kerrallaan.
            for (int i2 = 0; i2 < array2d[1].length; i2++) {
                if (i2 != YIndex) {
                    array2d[i][i2] = charX;
                    System.out.print(array2d[i][i2]);
                }
                else {
                    array2d[i][i2] = charY;
                    System.out.print(array2d[i][i2]);
                }
                
                    
            }
        }
            
    }
        //Yleinen errori catchi, joka typist‰‰ kaikki errorit yhdelle ja samalle tulosteelle.
        catch(Exception e) {
            System.out.println("Error!");
            System.exit(1);
    }
      
    }
    
    
    // MAIN \\
        public static void main (String[] args) {
            try {
            System.out.println("Hello! I am an exceptional array initialiser.");
            
            System.out.println("Please, enter the number of rows:");
            int arrayRows = In.readInt();
            
            System.out.println("Please, enter the number of columns:");
            int arrayColumns = In.readInt();
            
            char[][] array2d = new char[arrayRows][arrayColumns];
            
            System.out.println("Please, enter the first character:");
            char charX = In.readChar();
            
            System.out.println("Please, enter the second character:");
            char charY = In.readChar(); 
            
            System.out.println("Please, enter the column index:");
            int YIndex = In.readInt();
            // Kyselyt laitoin do-whilel, mutta erroria t‰yty saada tulosteisiin, niin tein n‰in,
            if (YIndex >= arrayColumns) {
                System.out.print("Error!");
                System.exit(1);
            }
            
            workArray(array2d, charX, charY, YIndex);
            }
            catch(Exception NegativeArraySizeException) {
                System.out.println("Error!");
                System.exit(1);
            }
            
            
    }
    
}
