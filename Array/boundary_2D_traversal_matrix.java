package Array;
// 1 2 3
// 4 5 6
// 7 8 9
public class boundary_2D_traversal_matrix {
    public static void main(String[] args) {
       int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int m=arr.length;
       int n=arr[0].length;
       //l to r
       for(int i=0;i<m;i++)
         System.out.print(arr[0][i]+"->");
       //t to b
       for(int i=1;i<n;i++)
        System.out.print(arr[i][n-1]+"->");
       //r to l
       for(int i=m-2;i>=0;i--)
        System.out.print(arr[m-1][i]+"->");
       //b to t
       for(int i=m-2;i>0;i--)
        System.out.print(arr[i][0]);
    }
}
