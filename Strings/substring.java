package Strings;

public class substring {
    public static void main(String[] args) {
        String s="helloworld";
        System.out.println(s.substring(0,6));
        for(int i=0;i<s.length();i++)
        System.out.println(s.substring(0,i+1)+"  "+s.substring(i));
        System.out.println(" all substring:");
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            System.out.println(s.substring(i,j+1));
        }
    }
    
}
