package Strings;

import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        String s="1222334444"; // output : 4444222331
        int freq[]=new int[10];
        for(char c:s.toCharArray())
        {
            freq[c-'0']++;
        }
        int max=Arrays.stream(freq).max().orElse(0);
        String ans="";
        for(int i=max;i>0;i--)
        {
            for(int num=9;num>=0;num--)
            {
                if(freq[num]==i)
                {
                    for(int k=0;k<freq[num];k++)
                        ans+=num;
                    }
                }
            }
        System.out.println(ans);
    }
    
}
