package Array;

public class snake_2D_matrix {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        //int n=mat[0].length;
        int m=mat.length;
        for(int i=0;i<m;i++)
        {
        if(i%2==0)
            {
            for(int j=0;j<m;j++)
                System.out.print(mat[i][j]+" ");
            }
        else{
            for(int j=m-1;j>=0;j--)
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}  

