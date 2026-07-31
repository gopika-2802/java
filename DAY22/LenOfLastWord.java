package DAY22;

public class LenOfLastWord {
    public static void main(String[] args) {
        String s="fly on the moon ";
        String words []=s.trim().split("\\s+");
        int len=words[words.length-1].length();
        System.out.println(len);
        int len1=findlen(s);
        System.out.println(len1);
    }
    public static int findlen(String s)
    {
        int len=s.trim().length()-s.trim().lastIndexOf(" ")-1;
        return len;
    }
}
