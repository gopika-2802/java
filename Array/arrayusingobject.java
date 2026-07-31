package Array;
import java.util.Scanner;

public class arrayusingobject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Object arr[]={1,1.05608,"good",7.8f,true,'A'};//object is single datatype used to store the multiple datatype values in single.
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
