package loop;
import java .util.*;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of sub:");
        int n=sc.nextInt();
        int max=0;
        System.out.println("enter the marks:");
        for(int i=1;i<=n;i++)
        {
            int mark=sc.nextInt();
            max=mark>max?mark:max;
        }
        System.out.println(max);
        sc.close();
    }    
}
