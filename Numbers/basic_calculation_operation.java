package Numbers;
import java.util.Scanner;

public class basic_calculation_operation {
    public static void add(int n1,int n2)
    {
        int sum=n1+n2;
        System.out.println(sum);
    }
    public static void sub(int n1, int n2)
    {
        if(n1>n2)
        {
            System.out.println(n1-n2);
        }
        else
        {
            System.out.println("n1 is less than n2");
        }
    }
    public static void mul(int n1, int n2)
    {
        int mul=n1*n2;
        System.out.println(mul);
    }
    public static void divi(int n1, int n2)
    {
        int divi=n1/n2;
        System.out.println(divi);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.println("enter n1,n2:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("enter the operation(1.add,2.sub,3.mul,4.divi):");
        int operation=sc.nextInt();
        switch (operation) {
            case 1:
                add(n1,n2);
                break;
            case 2:
                sub(n1, n2);
                break;
            case 3:
                mul(n1, n2);
                break;
            case 4:
                divi(n1, n2);
                break;
            default:
                System.out.println("enter valid operation");
                break;
        }
        sc.close();
    }
    
}
