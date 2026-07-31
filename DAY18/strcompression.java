package DAY18;

public class strcompression {
    public static String strcom(String s)
    {
        StringBuilder sb=new StringBuilder();
        boolean [] b=new boolean[s.length()];
        for(int i=0 ;i<s.length();i++)
        {
             // int r=0;
            // int count=1;
             // for(int j=i+1;j<i;j++)
            // {
            //     if(s.charAt(i)==s.charAt(j))
            //     {
            //         r++;
            //         break;
            //     }
            // }
            // if(r>0) 
            // continue;
            int count=1;
            if(b[i]) continue;
            for(int k=i+1;k<s.length();k++)
            {
                if(s.charAt(i)==s.charAt(k))
                {
                    count++;
                    b[k]=true;
                }
            }
            sb.append(s.charAt(i)).append(count);
        }
        return sb.toString();
        // strcompression using frequence
        // int freq[]=new int[26];
        // for(int i=0;i<s.length();i++)
        // freq[i-'a']++;
        // for(int i=0;i<s.length();)
        // {
        //     char c=(char)(i+'a');
        //     sb.append(c).append(freq[i]);
        // }
        // return sb;
        
    }
    public static void main(String[] args) {
        String s="aaaaagbbbdddhhhgggg";
        String sb=strcom(s);
        System.out.println(sb);
    }
    
}
