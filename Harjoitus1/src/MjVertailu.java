/*
 * Viikkoharjoitus 1, tehtävä 7.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * Vertailee 2-eri merkkiä, yhdestä merkkijonosta.
 *
 */

public class MjVertailu {
    public static void MjVertaile(String mj, int i0, int i1)
    {
        if (mj.charAt(i0) == mj.charAt(i1))
            System.out.println("Merkit '"+mj.charAt(i0)+ "'" + "ja'" + mj.charAt(i1) + "' ovat samat.");
        else
            System.out.print("Merkit '" + mj.charAt(i0)+"'" + "ja'" + mj.charAt(i1) + "' eivät ole samat.");
            
    }
    public static void main (String[] args)
    {
        System.out.println("Moi! Vertailen kahta merkkijonon merkkiä.");
        System.out.println("Anna merkkijono:");
        String mj = In.readString();
        System.out.println("Anna 1. merkin indeksiarvo:");
        int i0 = In.readInt();
        System.out.println("Anna 2. merkin indeksiarvo:");
        int i1 = In.readInt();
        MjVertaile(mj, i0, i1);
    }
}
