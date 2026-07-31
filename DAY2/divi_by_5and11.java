package DAY2;

import java.util.Scanner;

public class divi_by_5and11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0&&n%11==0)
        {
            System.out.println("number is divided  by 5 and 11.");
        }
        else{
            System.out.println("not divisible by 5 and 11");
        }
        sc.close();
    }
}
