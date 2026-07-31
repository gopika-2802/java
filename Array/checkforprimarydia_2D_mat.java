package Array;
//leetcode 766
// 1  2  3  4
// 2  1  2  3
// 3  2  1  2
// 4  3  2  1
public class checkforprimarydia_2D_mat {
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{2,1,2,3},{3,2,1,2},{4,3,2,1}};
        boolean flag=true;
        for(int i=1;i<mat.length;i++)
        {
            for(int j=1;j< mat[0].length;j++)
            {
                if(mat[i][j]!=mat[i-1][j-1])
                    flag=false;
            }
        }
        System.out.println(flag?"yes":"no");
    }
}
