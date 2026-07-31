import java.util.Arrays;

public class move0tofirst {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,1,0,0,0,0};
        int count=0;
        for(int num:arr)
        {
            if(num==0)
                count++;
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
