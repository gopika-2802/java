package Array;
public class saddlepointofmatrix_2d_ {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,3,6},{11,8,9}};
        for(int i=0;i<mat.length;i++)
        {
            int min=0;
            for(int j=1;j<mat[0].length;j++)
            {
                if(mat[i][j]<mat[i][min])
                    min=j;
            }
            boolean issaddle=true;
            for(int k=0;k<mat.length;k++)
            {
                if(mat[k][min]>mat[i][k])
                {
                    issaddle=false;
                    break;
                }
            }
            if(issaddle)
                {
                    System.out.println("saddle is "+mat[i][min]);return;
                }
        }
        System.out.println("no saddle");
    }  
}
