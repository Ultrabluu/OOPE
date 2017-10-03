/* 
 * Viikkoharjoitus 5, tehtävä 2.
 *  
 * Lausekielinen ohjelmointi II, syksy 2016.
 *
 * Raine Nuutinen, Nuutinen.Raine.M@student.uta.fi
 *
 * A program, that evaluates matrixes null values to non-null value relation.
 *
 */

public class MatrixEvaluation {
   
    public static double evaluateMatrix(double matrix[][])
    {
        int riviPituus = matrix[0].length;
        int sarakePituus = matrix[1].length;
        double lukuLaskuri = 0.0;
        double nollaLaskuri = 0.0;
        if (matrix != null)
        {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int i2 = 0; i2 < riviPituus; i2++)
            {
                System.out.println(matrix[i][i2]);
                
                if (matrix[i][i2] != 0.0)
                {
                    lukuLaskuri++;
                }
                else
                {
                    nollaLaskuri++;
                }
            }
        } 
        }
        return (lukuLaskuri/nollaLaskuri);
    }
   
    public static void main (String[] args)
    {
        double[][] matrix = new double[][]
        {
            new double[] {0, 1},
            new double[] {0, 1},
        };
        System.out.println(evaluateMatrix(matrix));
                    
    }
}
        
    


