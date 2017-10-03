    /*
     * Viikkoharjoitus 3, tehtävä 3.
     *
     * Lausekielinen ohjelmointi II, syksy 2016.
     *
     * Nuutinen.Raine.m@student.uta.fi
     * 
     * Palauttaa String viikonpäivän - int-arvoisesta userinputista.
     * 
     */
public class T3TulostaPaivaTaulukko {
        public static String viikonpv (int paiva)
        {
            String[] stringTaulukko = new String[7];
            stringTaulukko[0] = "Maanantai";
            stringTaulukko[1] = "Tiistai";
            stringTaulukko[2] = "Keskiviikko";
            stringTaulukko[3] = "Torstai";
            stringTaulukko[4] = "Perjantai";
            stringTaulukko[5] = "Lauantai";
            stringTaulukko[6] = "Sunnuntai";
            
            return stringTaulukko[paiva-1];
            
        }
        public static void main (String[] args)
        {

            System.out.println("Anna viikonpv numerona 1-7");
            int paiva = In.readInt();
            String ppaiva = viikonpv(paiva);
            System.out.print(ppaiva);
        }
}


