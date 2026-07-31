package Array;

import java.util.Arrays;
public class removedupusingdistinct {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,1,3,1,7};
        Arrays.stream(arr).distinct().forEach(s->System.out.println(s));


        //   for(int i=0;i<arr.length;i++) 
       //     System.out.println(arr[i]);


       //    for(int n:arr)
       //     System.out.println(n);

       //arr.forEach(s->System.out.println(s));// check for error

    }
}
