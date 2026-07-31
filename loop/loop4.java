package loop;
import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("total number bed ");
        int bed=sc.nextInt();
        int curbed=0;
        while(curbed<=bed)
        {
            System.out.println("enter pat name");
            String p=sc.nextLine();

            if(curbed!=bed)
            {
                System.out.println("admit the patient "+p);
                curbed++;
            }
            else if(curbed==bed)
            {
                System.out.println("no bed available "+p+" in waiting list ");
            }
        }
        sc.close();
    }
    
}
