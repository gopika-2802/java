package DAY26;

public class jumpgame {
    public static void main(String[] args) {
        int []num={2,3,1,1,4};
        System.out.println(canJump(num));
    }
    public static boolean canJump(int[] nums) {
        int res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            i=res;
            if(res==nums[i])
            return true;
        }
        return false;
    }
}