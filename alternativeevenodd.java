import java.util.Arrays;

public class alternativeevenodd {
    public static void main(String[] args) {
        int arr[]={1,7,2,6,8,5};
        int n=arr.length;
        int oc=0,ec=0;
        for(int i=0;i<n;i++)
        {

            if(arr[i]%2==0)
                ec++;
            else
                    oc++;

        }
        int evn[]=new int[ec];
        int odd[]=new int[oc];
        Arrays.sort(evn);
        Arrays.sort(odd);
    }
    
}
