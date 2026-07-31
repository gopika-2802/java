package search;
public class linearsea {
    public static int sea(int arr[],int t)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==t) return i;
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[]={1,5,2,8,0,4,3};
        int t=2;
        int res=sea(arr,t);
        System.out.println(res);
    }
}
