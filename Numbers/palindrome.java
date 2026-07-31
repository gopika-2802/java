package Numbers;
import java.util.Scanner;

public class palindrome 
{
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int s=0;
        while(n!=0)
        {
           s=s*10+n%10;
           n/=10;
        }
        if(n1==s)
        {
            System.out.println("pali");
        }
        else
        {
            System.out.println("not pali");
        }
        sc.close();
    }
    */
    public static void pali(int n)// by using method
    {
        int n1=n;
        int s=0;
        while(n!=0)
        {
           s=s*10+n%10;
           n/=10;
        }
        if(n1==s)
        {
            System.out.println("pali");
        }
        else
        {
            System.out.println("not pali");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pali(n);
        sc.close();
    }
}
