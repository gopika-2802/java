package Array;

public class consecutiveonecount {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,0};
        int n=arr.length;
        int r=ones(arr, n);
        System.out.println(r);
    }
    public static int ones(int []arr,int n)
    {
        int r=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            count++;
            else if(arr[i]==0)
            {count=0;
            continue;
            }
            if(count>r)
            r=count;
        }
        return r;
    }
}
