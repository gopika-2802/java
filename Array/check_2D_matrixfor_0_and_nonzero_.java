package Array;
//leetcode 2319

//  input:   1 0 1
//           0 2 0
//           3 0 3
public class check_2D_matrixfor_0_and_nonzero_ {
    public static void main(String[] args) {
        int mat[][]={{1,0,1},{0,2,0},{3,0,3}};
        boolean flag =true ;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
                
                if((i==j||(i+j)==(mat.length-1))&&mat[i][j]==0)
                    flag=false;
                else if((i==j||(i+j)==(mat.length-1))&&mat[i][j]==0)
                    flag=false;
                
            }
            System.out.println();
        }
        System.out.println(flag?"yes":"no");
    }
}
