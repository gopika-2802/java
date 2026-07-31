package Array;

public class matrixaddtion {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
    int b[][]={{1,2},{1,1}};
    int c[][]=new int[a.length][a[0].length];
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            for(int k=0 ;k<a.length;k++)
                c[i][j]+=a[i][k]*b[k][j];
        }
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    }
    
}
