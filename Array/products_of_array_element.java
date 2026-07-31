package Array;

public class products_of_array_element {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int p=1;
        for(int i=0;i<arr.length;i++)
        {
            p=arr[i]*p;
        }
        System.out.println(p);
    }
    
}
