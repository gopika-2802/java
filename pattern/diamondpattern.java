package pattern;
import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=i;k<=n;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=n;i>=1;i--)
        {
            for(int k=i;k<=n;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
