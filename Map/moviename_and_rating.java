package Map;

import java.util.HashMap;
import java.util.Map;

public class moviename_and_rating {
    public static void main(String[] args) 
    {
        Map<String,Float> map=new HashMap<>();
        map.put("A",9.5f);
        map.put("D",10.0f);
        map.put("G",9.5f);
        map.put("E",6.5f);
        map.put("J",9.5f);
        float max=0;
        String ans="";
        for(String s:map.keySet())
        {
            if(map.get(s)>max)
            {
                max=map.get(s);
                ans=s;
            }
        }
        System.out.println(ans);
        System.out.println(map.keySet());// to access keys
        System.out.println(map.values());// to access values
    }
}
