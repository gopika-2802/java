package Array;

public class rowsum_2D_array_matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        for(int i=0;i<arr.length;i++)
        {
            int rsum=0,csum=0;
            for(int j=0;j<arr[0].length;j++)
            {
                rsum+=arr[i][j];// row sum
                csum+=arr[j][i];// column sum
            }
            System.out.print((rsum+" "));
            System.out.println(csum+" ");
        }
    }
}
