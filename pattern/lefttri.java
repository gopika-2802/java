package pattern;
//left angle triangle
public class lefttri {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            // for(int j=n-i-1;j>0;j--)
            //     System.out.print(" ");
            // for(int k=0;k<=i;k++)
            //     System.out.print("*");
            // System.out.println();
            
            // the below code reduce one loop i.e, k loop , we just skip the k loop by using ?: 
            for(int j=n;j>=1;j--)
                System.out.print(i>=j?"*":" ");
            System.out.println();
        }
    }  
}
