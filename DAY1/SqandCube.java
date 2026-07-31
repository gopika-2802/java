package DAY1;

import java.util.Scanner;

public class SqandCube {
    public static void pow(int n)
    {
        int sq=n*n;
        int cube =n*n*n;
        System.out.println("sq :"+sq+"   cube : "+cube);
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in );
        int n=sc.nextInt();
        pow(n);
        sc.close();
    }
    
}
