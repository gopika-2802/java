package Strings;
import java.util.Scanner;

 public class count_the_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        vowels(s);
        sc.close();
    }
    public static void vowels(String s)
    {
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
