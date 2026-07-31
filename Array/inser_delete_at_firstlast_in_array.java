package Array;

import java.util.Scanner;

public class inser_delete_at_firstlast_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the ele to insert:");
        int val=sc.nextInt();
        insert_delete(arr,val);
        sc.close();
    }
    public static void insert_delete(int []arr,int val) {
        int infirst[]=new int[arr.length+1];
        infirst[0]=val;
        for(int i=0;i<arr.length;i++)
        {infirst[i+1]=arr[i];
        }
        System.out.println("insert at first");
        for(int n:infirst)
        {
            System.out.print(n);
        }
        System.out.println();// just for line
        int inlast[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            inlast[i]=arr[i];
        }
        inlast[inlast.length-1]=val;
        System.out.println("\ninsert at last");
        for(int n:inlast)
        {
            System.out.print(n);
        }
        System.out.println();// just for line
        //deleting
        int delfirst[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
           delfirst[i]=arr[i+1];
        }
        System.out.println("\ndelete at first");
        for(int n:delfirst)
        System.out.print(n);

        System.out.println();//just for line

        int dellast[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
           dellast[i]=arr[i];
        }
        System.out.println("\ndelete at first");
        for(int n:dellast)
        System.out.print(n);
        System.out.println();//just for extra line
    }
    
}
