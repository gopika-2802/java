package Strings;

import java.util.Arrays;

public class CheckEmptyorBlanck {
    public static void main(String[] args) {
        String s=" ";
        System.out.println(s.isBlank());//true because it contaionns only black sapce.
        System.out.println(s.isEmpty());// false because it contains space that is its length is not 0.
        String s1="helo world   ";
        s1=s1.trim();// trim upto blank space.
        System.out.println(s1);
        String s2="hello world  ";
        String s3[]=s2.split(" ");// split the string based on given letter that is space and store in array,
        System.out.println(Arrays.toString(s3));
        System.out.println(s2.toLowerCase());//lowercase
        System.out.println(s2.toUpperCase());//uppercase
        char []c=s2.toCharArray();// to character array
        System.out.println(Arrays.toString(c));// again back to string
        System.out.println(new String(c));
        System.out.println(c);
        System.out.println(Arrays.toString(c));
        System.out.println(c);
    }   
}
