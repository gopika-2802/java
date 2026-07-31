package Array;

public class flipbinary {
    public static void main(String[] args) {
        int n=173;
        String b=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<b.length();i++)
            ans+=(b.charAt(i)=='1')?"0":"1";
        System.out.println(Integer.parseInt(ans,2));
    }
    
}
