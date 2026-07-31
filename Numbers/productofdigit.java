package Numbers;
import java.util.Scanner;

public class productofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prt=1;
        do
        {
            int m=n%10;
            prt=prt*m;
            n/=10;
        }while(n!=0);
        System.out.println(prt);
        sc.close();
    }
    
}
