package DAY21;

import java.util.Scanner;

public class Stringrotatecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String g=sc.nextLine();
        System.out.println(checkrotate(s,g));
        sc.close();
    }
    public static boolean checkrotate(String s,String g)
    {
        if(s.length()!=g.length()) return false;
        s=s+s;
        return s.contains(g);
    }

}
