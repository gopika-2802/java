package DAY21;

import java.util.Scanner;

public class reversethevowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=vowelrev(s);
        System.out.println(s1);
        sc.close();
    }
    public static String vowelrev(String s)
    {
        char []c=s.toCharArray();
        int i=0,j=c.length-1;
        while(i<j)
        {
        while(i<j&&!(c[i]=='a'||c[i]=='i'||c[i]=='e'||c[i]=='o'||c[i]=='u')) i++;
        while(i<j&&!(c[j]=='a'||c[j]=='i'||c[j]=='e'||c[j]=='o'||c[j]=='u')) j--;
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        i++;j--;
        }
        return new String(c);
    }
    // public static void main(String[] args) 
    // {
    //     String s="hello world";
    //     char []c=s.toCharArray();
    //     int i=0,j=c.length-1;
    //     while(i<j)
    //     {
    //     while(i<j&&!(c[i]=='a'||c[i]=='i'||c[i]=='e'||c[i]=='o'||c[i]=='u')) i++;
    //     while(i<j&&!(c[j]=='a'||c[j]=='i'||c[j]=='e'||c[j]=='o'||c[j]=='u')) j--;
    //     char temp=c[i];
    //     c[i]=c[j];
    //     c[j]=temp;
    //     i++;j--;
    //     }
    //     System.out.println(new String(c));
    // }
}
