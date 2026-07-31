package DAY1;

import java.util.Scanner;

public class Sum_mul_divi_rem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        opt(n1,n2);
        sc.close();
    }
    public static void opt(int n1,int n2)
    {
        int add=n1+n2;
        int sub=n1-n2;
        int mul=n1*n2;
        int divi=n1/n2;
        int rem=n1%n2;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(divi);
        System.out.println(rem);
    }
    
}
