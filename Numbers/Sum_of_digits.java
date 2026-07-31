package Numbers;
import java.util.Scanner;

public class Sum_of_digits {
    /*
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int s=0;
        while(n!=0)
        {
           s=s+n%10;
           n/=10;
        }
        System.out.println(s);
        sc.close();
    }
     */
    public static int sop(int n)
    {
        int s=0;
        while(n!=0)
        {
           s=s+n%10;
           n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=sop(n);
        System.out.println(sum);
        sc.close();
    }
}
