package search;
public class binarysearchforduplicatevale {

    public static int search(int arr[],int t)
    {
        int low=0,high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(t==arr[mid]) 
            {
                  res=mid;
                  high=mid-1;//(for first occurence) 
                   /* to find the value in duplicates 
                   low=mid+1;(for last occurence)
                  */
            }
            else if(t>arr[mid]) 
            low=mid+1;
            else if(t<arr[mid]) 
            high=mid-1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,3,5,7,8,10,28};
        int t=3;
        int res=search(arr,t);
        System.out.println(res);
    }
}
