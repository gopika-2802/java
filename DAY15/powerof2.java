package DAY15;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=powof2(n);
        System.out.println(b);
        sc.close();
    }
    public static boolean powof2(int n)
    {
        if(n<=0) return false;
        while(n%2==0)
        n/=2;
        return n==1;
    }
    
}
