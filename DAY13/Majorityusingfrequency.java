package DAY13;

public class Majorityusingfrequency {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,2,1,23,3,3,31,1,1,1};
        int n=arr.length;
        int res= majorele(arr,n);
        System.out.println(res);
    }
    public static int majorele(int[]arr,int n)
    {
        int key=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            key=arr[i];
        
        count+=(arr[i]==key)?1:-1;
        }
        int fre=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            fre++;
        }
        if(fre>arr.length/2)
        {
            return key;
        }
        return -1;
    }
    
}
