package DAY25;

public class revbit {
    public static void main(String[] args) {
        int n = 43261596;
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String sr = "";
        for (int i = s.length() - 1; i >= 0; i--)
            sr += s.charAt(i);
        int res = (int) Long.parseLong(sr, 2); // parse as binary
        System.out.println(res);
    }
    
}
