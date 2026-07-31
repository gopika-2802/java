package prime;
import java.util.Scanner;

public class twisted_prime {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,prime=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            prime=n;
            int s=0,count1=0;
            while(n!=0)
            {
               s=s*10+n%10;
               n/=10;
            }
            for(int i=1;i<=s;i++)
            {
                if(s%i==0)
                count1++;
            }
            if(count1==2)
            {
                System.out.println(prime+" twisted prime num. ");
            }
            else{
                System.out.println(prime+" is not twisted prime number.");
            }
        }
        else{
            System.out.println(n+" is not prime number.");
        }
        sc.close();
    }*/
// by using method
    public static void tprime(int n)
    {
        int count=0,prime=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            prime=n;
            int s=0,count1=0;
            while(n!=0)
            {
               s=s*10+n%10;
               n/=10;
            }
            for(int i=1;i<=s;i++)
            {
                if(s%i==0)
                count1++;
            }
            if(count1==2)
            {
                System.out.println(prime+" is twisted prime num. ");
            }
            else{
                System.out.println(prime+" is not twisted prime number.");
            }
        }
        else{
            System.out.println(n+" is not prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tprime(n);
        sc.close();
    }
    
}
