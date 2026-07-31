package Array;


public class max_count_postive_negativeinArray {
    public static int carr(int arr[]) {
        int pos=0,neg=0;
        for(int n:arr)
        {
            if(n<0)
            neg++;
            else if(n>0)
            pos++;
            else
            System.out.println("it is zero");
        }
        return Math.max(pos, neg);
    }
    public static void main(String[] args) {
        int arr[]={5,8,-7,9,1,-3};
        System.out.println(carr(arr));
    }
    
}
