package Array;
// leetcode : 1923
public class milestone_array {
    public static void main(String[] args) 
    {
        int modules[]={5,2,1,4,1};
        long sum=0,max=0;
        for(int n:modules)
        {
            sum+=n;
            if(n>max) max=n;
        }
        long remain=sum-max;
        if(max>remain+1)
            System.out.println(2*remain+1);
        else
            System.out.println(sum);
    }
}
