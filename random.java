import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maximum number: ");
        int n=sc.nextInt();
        System.out.println((int)(Math.random()*n)+1);
        sc.close();
    }
}