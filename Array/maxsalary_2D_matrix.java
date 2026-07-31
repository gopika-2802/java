package Array;
//leetcode 1672
public class maxsalary_2D_matrix {
   public static void main(String[] args) {
    int comp[][]={{1,2,3},{4,5,6},{7,8,9}};
    int maxsalary=0;
    int emp=0;
    for(int i=0;i<comp.length;i++)
    {
        int salary=0;
        for(int j=0;j<comp[0].length;j++)
        {
            salary+=comp[i][j];
        }
        if(maxsalary<salary)
        {
            maxsalary=salary;
            emp=i+1;
        }
    }
    System.out.println("employee "+emp+" get max salary as "+maxsalary);
   }
}