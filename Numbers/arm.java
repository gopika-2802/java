package Numbers;
import java.util.Scanner;

public class arm {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int n1=n;
        int sum=0;
        while(n!=0)
        {
            int m=n%10;
            sum=sum+(m*m*m);
            n=n/10;
        }
        if(n1==sum)
        {
            System.out.println("arm num");
        }
        else{
            System.out.println("no arm num");
        }
        sc.close();
    } */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=armstrong(n);
        if(n==sum)
        {
            System.out.println("arm num");
        }
        else{
            System.out.println("no arm num");
        }
        sc.close();
    }
    public static int armstrong(int n) //by method
    {
        int sum=0;
        while(n!=0)
        {
            int m=n%10;
            sum=sum+(m*m*m);
            n=n/10;
        }
        return sum;
    }
}
