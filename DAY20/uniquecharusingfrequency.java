package DAY20;

import java.util.Scanner;

public class uniquecharusingfrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(freq(s));
        sc.close();
    }
    public  static char freq(String s)
    {
        int fre[]=new int[26];
        for(char c:s.toCharArray())
        fre[c-'a']++;
        for(int i=0;i<s.length();i++)
        {
            if(fre[s.charAt(i)-'a']==1)
            return s.charAt(i);//System.out.println(s.charAt(i));
        }
        return ' ';
    }
    
}
