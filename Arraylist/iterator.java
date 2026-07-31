package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++) 
            list.add(arr[i]);
        Iterator<Integer> it=list.iterator();
        while (it.hasNext())
        {
          int val=it.next();
          System.out.println(val);
        }
    }
    
}
