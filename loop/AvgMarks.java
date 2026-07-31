package loop;
import java.util.*;
public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of marks");
        int n=sc.nextInt();
        System.out.println("Enter the marks:");
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+sc.nextInt();
        }
        int avg;
        avg=sum/n;
        System.out.println("avg:"+avg);
        sc.close();
    }  
}
