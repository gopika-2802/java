package search;
public class binarysea {
    public static int search(int arr[],int t)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(t==arr[mid]) 
            return mid;
            else if(t>arr[mid]) 
            low=mid+1;
            else if(t<arr[mid])
            high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,3,5,7,8,10,28};
        int t=3;
        int res=search(arr,t);
        System.out.println(res);
    }
}
