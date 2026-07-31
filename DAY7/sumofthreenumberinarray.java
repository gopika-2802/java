package DAY7;

public class sumofthreenumberinarray {
    public static void threesum(int [] arr,int n)
    {
        int sum=1;
        boolean flag=false;     // if there is no number to make sum value then use of flag 
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        flag=true;
                    }
                }
            }
        }
        if(!flag)
            System.out.println("there is numbers to make "+sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,-1,-2};
        int n=arr.length;
        threesum(arr, n);
    }    
}
