package DAY2;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1,fib=0;
        int i=0;
        System.out.println("0 1 ");
        while(i<=n)
        {
            fib=f1+f2;
            System.out.print(fib+" ");
            f1=f2;
            f2=fib;
            i++;
        }
        sc.close();
    }
    
}
