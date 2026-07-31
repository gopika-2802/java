package Arraylist;
//leetcode 500
import java.util.ArrayList;
import java.util.Arrays;
public class wordmatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(word()));
    }
    public static String[] word()
    {
        ArrayList<String> wr=new ArrayList<>(Arrays.asList("Dad","Alaska","Good","Bad"));
        ArrayList<String> res=new ArrayList<>();
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        //String r3="zxcvbnm";
        for(String s:wr)
        {
            int c1=0,c2=0,c3=0;
            String s1=s.toLowerCase();
            for(char c:s1.toCharArray())
            {
                if(r1.indexOf(c)!=-1)
                    c1++;
                else if(r2.indexOf(c)!=-1)
                    c2++;
                else
                    c3++;
            }
            if(c1==s.length()||c2==s.length()||c3==s.length())
                res.add(s);
        }
        return res.toArray(new String[0]);
    }   
}