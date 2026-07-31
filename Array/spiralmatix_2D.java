package Array;
import java.util.ArrayList;
//leetcode 54
public class spiralmatix_2D {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        int top=0,bottom=n-1,left=0,right=mat[0].length-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
                res.add(mat[top][i]);
            top++;
            for(int j=top;j<=bottom;j++)
                res.add(mat[j][right]);
            right--;
            if(top<=bottom)
            {
                for(int j=right;j>=left;j--)
                    res.add(mat[bottom][j]);
                bottom--;
            }
            if(left<=right)
            {
                for(int j=bottom;j>=top;j--)
                    res.add(mat[j][left]);
                left++;
            }
        }
        System.out.println(res);
    }
}