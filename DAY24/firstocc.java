package DAY24;

import java.util.Scanner;

public class firstocc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.indexOf(t)==0)
        System.out.println("true");
        else
        System.out.println("false");
        sc.close();
    }
    
}
