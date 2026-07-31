package Numbers;
import java.util.Scanner;

public class perfect {
/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc. nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s==n)
        {
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect");
        }
        sc.close();
    }*/
    public static void per(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s==n)
        {
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc. nextInt();
        per(n);
        sc.close();
    }
}
