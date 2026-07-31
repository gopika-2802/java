package DAY2;

import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int min=n1<n2?n1:n2;
        int GCD=0;
        for(int i=1;i<=min;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                System.out.print(i+" ");
                GCD=i;
            }
        }
        int LCM=(n1*n2)/GCD;
        System.out.println("\nLCM  "+LCM+"\nGCD  "+GCD);
        sc.close();
    }
    
}
