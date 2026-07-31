package Array;

public class array_collapse_game {
    public static void main(String[] args) {
        int arr[]={8,2,5,3};
        int n=arr.length;
        while(n>0)
        {
            for(int i=0;i<n-1;i++)
            {
                arr[i]=Math.abs(arr[i]-arr[i+1]);
            }
            n--;
        }
        System.out.println(arr[0]);
    }
    
}
