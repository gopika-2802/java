package Numbers;
import java.util.Scanner;

public class strong_number {
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1; 
        }
        else
        {
            return n*fact(n-1);
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        strong(n);
        sc.close();
     }
     public static void strong(int n)
     {
        int n1=n;
        int s=0;
        while(n!=0)
        {
            s=s+fact(n%10);
            n/=10;
        }
        if(n1==s)
        {
            System.out.println("strong");
        }
        else
        {
            System.out.println("not strong");
        }
     }

}
