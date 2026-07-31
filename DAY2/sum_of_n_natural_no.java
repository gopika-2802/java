package DAY2;

import java.util.Scanner;

public class sum_of_n_natural_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println(s);
        sc.close();
    }
    
}
