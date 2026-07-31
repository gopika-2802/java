package DAY15;

import java.util.Scanner;

public class strpali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rs=rev(s);
        boolean b=pali(s, rs);
        System.out.println(b);
        sc.close();
    }
    public static boolean pali(String s,String rs){
    return (s.equalsIgnoreCase(rs));
    }
    public static String rev(String s)
    {
        StringBuilder sr=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sr.append(s.charAt(i));
        }
        return sr.toString();
    }
}
// using 2 pointer 
// public static boolean paliusing2pointer(String s)
// {
//     int start=0;
//     int end=s.length()-1;
//     if(s.charAt(start)!=s.charAt(end)) return false;
//     else
//     {
//         start++;end--;
//     }
//     return true;

// }
