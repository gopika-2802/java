package DAY3;

public class Largest_and_smallest_element
{
    public static void maxminarr(int []arr)
    {
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);

    }
    public static void main(String[] args) 
    {
        int []arr={1,5,8,6,4};
        maxminarr(arr);
    }
    
}
