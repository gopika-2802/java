package Arraylist;
import java.util.ArrayList;
//leetcode 78
public class subsetbacktracking 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int arr[]={1,2,3};
        res.add(new ArrayList<>());
        for(int n:arr)
        {
            int size=res.size();
            for(int i=0;i<size;i++)
            {
                ArrayList<Integer> temp=new ArrayList<>(res.get(i));
                temp.add(n);
                res.add(temp);
            }
        }  
        //return res;
        System.out.println(res);
    }
}