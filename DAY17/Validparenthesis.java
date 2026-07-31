import java.util.Scanner;

public class Validparenthesis {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='('&&ch[i+1]==')')
            System.out.println("valid");
        }
        sc.close();
    }
    
}

