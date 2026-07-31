import java.util.*;
public class GCD {
    /*public static int fgcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return FGCD(b, a % b);
    }*/
    public static int fgcd(int a, int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The GCD  is " + fgcd(num1, num2));
        sc.close();
    }
    
}
