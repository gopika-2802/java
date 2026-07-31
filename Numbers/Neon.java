package Numbers;
import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int s=0;
        while(sq!=0)
        {
            int r=sq%10;
            s+=r;
            sq/=10;
        }
        if(n==s)
        {
            System.out.println("neon num");
        }
        else{
            System.out.println("not a neon num");
        }
        sc.close();
    }
    
}
