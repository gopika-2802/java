//leetcode 11
public class wateraqu {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=arr.length-1;
        int max=0;
        while(l<r)
        {
            int h=Math.min(arr[l],arr[r]);
            int w=r-l;
            max=Math.max(max,h*w);
            if(arr[l]<arr[r])
                l++;
            else
                r--;
        }
        System.out.println(max);
    }
}
