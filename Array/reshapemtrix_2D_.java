package Array;
//leetcode 566
//check leetcode no.1360 lucky no
import java.util.Arrays;
import java.util.Scanner;

public class reshapemtrix_2D_ {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int mat[][]={{1,2,3,5},{3,4,2,5},{5,1,7,9},{2,3,5,8}};
        int r=sc.nextInt();int c=sc.nextInt();
        int remat[][]=new int[r][c];
        int ind=0;
        if(mat.length*mat[0].length!=r*c) {
            System.out.println(" not possible");
            sc.close();// sc.close() for using return  
            return ;
        }
         for(int i=0;i<mat.length;i++)
         {
            for(int j=0;j<mat[0].length;j++)
            {
                remat[ind/c][ind%c]=mat[i][j];ind++;
            }
         }
        
         System.out.println(Arrays.deepToString(remat));
        sc.close();
    }
}
