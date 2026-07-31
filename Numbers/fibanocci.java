package Numbers;
import java.util.Scanner;

public class fibanocci {
/*
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1;
        int fib=0;
        System.out.print("0 1 ");
        for(int i=0;i<=n;i++)
        {
            fib=f1+f2;
            System.out.print(fib+" ");
            f1=f2;
            f2=fib;
            i++;
        }
        sc.close();
    }
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
        sc.close();
    }
    public static void fib(int n) //by method
    {
        int f1=0,f2=1;
        int fib=0;
        System.out.print("0 1 ");
        for(int i=0;i<=n;i++)
        {
            fib=f1+f2;
            System.out.print(fib+" ");
            f1=f2;
            f2=fib;
            i++;
        }
    }
}
