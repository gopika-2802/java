package Strings;

public class rethewordswithoutsplit {
    public static void main(String[] args) 
    {
        String s="i love java";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)        
        {
            if(s.charAt(i)!=' ')                           //res=""
                res.append(s.charAt(i));                   // res="i"
            else                                           // res=""
            {                                              // res="love"
                System.out.print(res.reverse()+" ");       // res="evol"
                res.setLength(0);               // res=""
            }                                             // res="java"
        }
        System.out.println(res.reverse());
    }
    
}
