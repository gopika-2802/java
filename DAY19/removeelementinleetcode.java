package DAY19;
public class removeelementinleetcode {
    public static void main(String[] args) {
        int[]arr={3,1,2,3,4};
        int e=3;
         int newLength = remo(arr, e);
        System.out.println( newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int remo(int []arr,int e)
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=e)
                arr[k++]=arr[i];
        }
        return k;
    }
}
