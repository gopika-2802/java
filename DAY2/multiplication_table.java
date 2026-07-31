package DAY2;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("multiplication table for "+n);
        for(int i=0;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
        sc.close();
    }
    
}
