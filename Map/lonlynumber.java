package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lonlynumber {
    public static void main(String[] args) {
        int arr[]={10,6,5,8};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:arr)
        {
            if(map.get(i)==1&&!map.containsKey(i-1)&&!map.containsKey(i+1))
                ans.add(i);
        }
        System.out.println(ans);
    }
}
