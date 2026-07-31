package pattern;

public class abc {
    public static void main(String[] args) 
    {
        int n=25;
        char c='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}