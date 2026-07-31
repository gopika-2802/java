import java .util.*;
public class GCD_using_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
        sc.close();
    }
    public static void gcd(int a,int b)
    {
        System.out.println("Common factors : ");
        int min = (a < b) ? a : b;
        int gcd=0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
                gcd=i;
            }
        }
        System.out.println("\nGCD : "+gcd);

    }
}
