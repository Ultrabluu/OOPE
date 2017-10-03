/*
 * Viikkoharjoitus 1, tehtävä 5.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 * 
 */

public class SwitchTreeni {
    public static void viikonpv (int paiva)
    {
        //Switchaillaan viikonpv, kytkin on kiva.
        String ppaiva = null;
        switch (paiva) {
        case 1: ppaiva = "Maanantai";
                break;
        case 2: ppaiva = "Tiistai";
        break;
        case 3: ppaiva = "Keskiviikko";
        break;
        case 4: ppaiva = "Torstai";
        break;
        case 5: ppaiva = "Perjantai";
        break;
        case 6: ppaiva = "Lauantai";
        break;
        case 7: ppaiva = "Sunnuntai";
        break;
        }
        System.out.print(ppaiva);
    }
    public static void main (String[] args)
    {
        System.out.println("Anna viikonpv numerona 1-7");
        int paiva = In.readInt();
        viikonpv(paiva);
    }
}
