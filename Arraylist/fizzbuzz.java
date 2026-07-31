package Arraylist;
// leetcode fizzbuzz
import java.util.ArrayList;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
                arr.add("fizzbuss");
            else if(i%5==0)
                arr.add("buzz");
            else if(i%3==0)
                arr.add("fizz");
            else
                arr.add(i+"");
        }
        System.out.println(arr);
        sc.close();
        // System.out.println(arr.reversed()); 
    }
}
 