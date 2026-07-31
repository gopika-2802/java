public class pizza_placement_test {
    public static void main(String[] args) {
        int n=6;
        int arr[]={-11,-2,43,56,5,-13};
        int k=3;
        for(int i=0;i<n-k;i++)
        {
            boolean f=false;
            for (int j=i;j<k;j++)
            {    if(arr[j]<0)
                {
                    System.out.print(arr[j]+" ");
                    f=true;
                }
            }
            if(!f)
            {
                System.out.print("0"+" ");
            }
        }
    }
    
}
