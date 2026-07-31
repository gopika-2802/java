package pattern;
import java.util.Scanner;

public class patternsusingfunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        patternfunction(n);
        sc.close();
    }
    public static int  patternfunction(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n||i==(n+1)/2||j==(n+1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return 0;
    }
    //using without return
    /*public static void patternfunction(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n||i==(n+1)/2||j==(n+1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }*/
}
