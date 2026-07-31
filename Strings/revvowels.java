package Strings;

public class revvowels {
    public static void main(String[] args) 
    {
        String s="hello world";
        char []c=s.toCharArray();
        int l=0,r=c.length-1;
        while(l<r)
        {
            if(!isvowel(c[l]))
                l++;
            else if(!isvowel(c[r]))
                r--;
            else{
                char temp=c[l];
                c[l]=c[r]; 
                c[r]=temp;
                r++;
                l--;
            }
        }
        System.out.println(new String(c));
    }
    public static  boolean isvowel(char c)
    { return "aeiouAEIOU".indexOf(c)>=0;//+ve vowel//-ve not vowel
    }
}
