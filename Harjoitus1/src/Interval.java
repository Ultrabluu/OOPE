/*
 * Viikkoharjoitus 1, tehtävä 6.
 *
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Nuutinen.Raine.m@student.uta.fi
 *
 * Checks, if X is between values Y & Z.
 *
 */
public class Interval {
    public static void isXbetweenYZ(int x, int y, int z)
    {
        //Katsotaan onko x intervallissa.
        if ((x >= y & x <= z) | (x <= y & x >= z))
            System.out.println("The integer belongs to the interval.");
        else
            System.out.println("The integer does not belong to the interval.");

    }
    public static void main (String[] args)
    {
        //Kyselyt
        System.out.println("Hello! I determine whether an integer belongs to an interval.");
        System.out.println("Enter the first endpoint:");
        int y = In.readInt();
        System.out.println("Enter the second endpoint:");
        int z = In.readInt();
        System.out.println("Enter the integer:");
        int x = In.readInt();
        isXbetweenYZ(x, y, z);
    }
}
