/* 
 * Viikkoharjoitus 5, tehtävä 3.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that scales 2D-matrix with given scale-value.
 *
 */

public class MatrixScalar {
    
    public static void matriisiSkaalaus(double matriisi[][], double skaalari)
    {
        if (matriisi != null)
        {
        for (int i = 0; i < matriisi.length; i++)
        {
            for (int i2 = 0; i2 < matriisi[1].length; i2++)
            {
                matriisi[i][i2] = matriisi[i][i2] * skaalari;
            }
        }
        }
    }
    
    public static void main (String[] args)
    {
        double skaalari = 2.0;
        double[][] matriisi = new double[][]
                {
                    new double[] {0, 1, 2},
                    new double[] {0, 1, 2}
                };

        matriisiSkaalaus(matriisi, skaalari);
    }
}
