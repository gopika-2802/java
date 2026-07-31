package loop;
import java.util.Scanner;
public class loop3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num passenger:");
        int n=sc.nextInt();
        int total=0;
        System.out.println("enter age of passenger:");
        for(int i=1;i<=n;i++) 
        {
            int age = sc.nextInt();
            if (age <= 5) 
            {
                System.out.println("free(Rs. O)");
            }
            else if (age > 5 && age <= 59)
            { 
                total+=100;
            }
            else if(age>=60)
            {
                total += 50;
            }
        }
        System.out.println("total:"+total);
        sc.close();
    }
}
