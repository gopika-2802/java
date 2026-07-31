package DAY1;

import java.util.Scanner;

public class Print_name_age_city {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());// Interger.parseInt() is used to covert string to int
        String city=sc.nextLine();
        System.out.println(name+"\n"+age+"\n"+city);
        sc.close();
    }
    
}
