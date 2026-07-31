package DAY20;
import java.util.Scanner;
public class firstuniquechar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        // for(int i=0;i<s.length();i++)
        // {
        //     int c=0;
        //     for(int j=0;j<s.length();j++)
        //     {
        //         if(s.charAt(i)==s.charAt(j)) c++;
        //     }
        //     if(c==1)
        //     System.out.println(s.charAt(i));
        // }
        for(char c:s.toCharArray())
        {
            if(s.indexOf(c)==s.lastIndexOf(c))//first index and last index of unique char should be same
            System.out.println(c);
        }
        sc.close();
    } 
}
