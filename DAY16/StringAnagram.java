package DAY16;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean b=ana(s1,s2);
        System.out.println(b);
        sc.close();
    }
    public static boolean ana(String s1,String s2)
    {
        char c1[]=s1.toLowerCase().toCharArray();
        char c2[]=s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length) 
        return false;
        return (Arrays.equals(c1,c2));
    }
}
