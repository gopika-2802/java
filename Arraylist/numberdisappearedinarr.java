package Arraylist;
import java.util.*;
//leetcode 448 Find All Numbers Disappeared in Rray
public class numberdisappearedinarr {
    public static void main(String[] args) {
        int num[]={4,3,2,7,8,2,3,1};
        ArrayList<Integer> list=new ArrayList<>();
        boolean seen[]=new boolean[num.length+1];
        for(int i:num)
            seen[i]=true;
        for(int i=1;i<=num.length;i++)
        {
            if(seen[i]==false)
                list.add(i);
        }
        System.out.println( list);
    }
}