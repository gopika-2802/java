package Strings;

public class StrReverse 
{
    public static void main(String[] args) 
    {
        String s="hello";
        String sr="";
        //String sr=new StringBuilder(s).reverse().toString();
        for(int i=s.length()-1;i>=0;i--)
        sr+=s.charAt(i);
        System.out.println(sr);
        System.out.println(reverse(s));
    }
    public static String reverse(String s)
    {
        if(s.isEmpty()) return s;
        else
        return reverse(s.substring(1))+s.charAt(0);
    }//time and space complexity is O(n^2)
}
/*
//easy to undersatnd which has time and space complexity as O(n)
  public class ReverseStringEfficient 
  {
    public static void main(String[] args) 
    {
        String str = "Hello World";

        char[] chars = str.toCharArray(); 

        reverse(chars, 0, chars.length - 1);

        System.out.println(new String(chars)); 
    }
    public static void reverse(char[] arr, int left, int right) 
    {
        if (left >= right) return; 
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }
}
 */
/*
 public static String reverse(String s)
 {
 StringBuilder sb=new StringBuilder();
 for(int i=s.length-1;i>=0;i--)
 {
 sb.append(s.charAt(i));
 }
 return sb.toString;
 }
 
 */