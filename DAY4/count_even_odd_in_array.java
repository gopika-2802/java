package DAY4;

public class count_even_odd_in_array {
    public static void main(String[] args) {
        int [] arr={4,5,8,7,2,6,10,13};
        int e=0,o=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            e++;
            else
            o++;
        }
        System.out.println("even: "+e+"\nodd: "+o);
    }
    
}
