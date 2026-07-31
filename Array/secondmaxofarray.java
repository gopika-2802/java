package Array;
public class secondmaxofarray {
    public static int smax(int[] arr)
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max1)
            {
                max2=max1;
                max1=num;
            }
            else if(num>max2&&max1!=num)
            {
                max2=num;
            }
        }
        return max2;
    }
    public static void main(String[] args) 
    {
        int arr[]={5,7,3,9,6,1,27,29,10,28};
        int max2=smax(arr);
        System.out.println(max2);
    }
    
}
