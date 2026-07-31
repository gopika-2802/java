package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class pasclestriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            if(i>0)
                row.add(1);
            res.add(row);
        }
        System.out.println(res);
        sc.close();
    }
}
