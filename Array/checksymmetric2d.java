package Array;

import java.util.Arrays;
// input: 1 2 3   output: 1 2 3  (row to column)
//        2 3 5           2 3 5
//        3 5 6           3 5 6
public class checksymmetric2d {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{2,3,5},{3,5,6}};
        int rmat[][]=new int [mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                //System.out.print(mat[j][i]);
                rmat[i][j]=mat[j][i];
            }
            // System.out.println();
        }
        System.out.println(Arrays.deepToString(rmat));
        System.out.println(Arrays.deepEquals(mat, rmat));
        // System.out.println(Arrays.deepEquals(mat, rmat)?"symm":"not");
    }
}