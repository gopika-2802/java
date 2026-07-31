package DAY24;

import java.util.Arrays;
import java.util.Scanner;

public class ramsomnote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String ransomNote=sc.nextLine();
            String magazine=sc.nextLine();
            System.out.println(ramson(ransomNote, magazine));
            sc.close();
    }
    public static boolean ramson(String ransomNote,String magazine)
    {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        int i = 0; 
        int j = 0;
        int rlen=r.length;
        int mlen=m.length;
        while (i < rlen && j < mlen) 
        {
            if (r[i] == m[j]) 
            {
                i++;
                j++;
            }
            else if (r[i] > m[j]) 
                j++;
            else 
                return false;
        }
        return (i == rlen);
    }
}
