package DAY1;

import java.util.Scanner;

public class Largest_of_two_numbers {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a<b)
    System.out.println("a is small");
    else
    System.out.println("b is small");
    sc.close();
    }
}
