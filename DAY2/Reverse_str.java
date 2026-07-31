package DAY2;

import java.util.Scanner;

public class Reverse_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rs="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rs=rs+s.charAt(i);
        }
        System.out.println(rs);
        sc.close();
    }
    
}
