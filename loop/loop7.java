package loop;
import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a ="yes";
        do{
            System.out.println((int)(Math.random()*7));
            System.out.println("continue or not");
            a=sc.nextLine();
        
            if(a.equals("no"))
            {
                System.out.println("thaks for playing");
            }
        }while(a.equals("yes"));
        sc.close();
    }
}
