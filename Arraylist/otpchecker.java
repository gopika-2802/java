package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class otpchecker {
    public static void main(String[] args) {
        ArrayList<Integer> userotp=new ArrayList<>();
        ArrayList<Integer> dbotp=new ArrayList<>(Arrays.asList(1,2,3,4));
        while (userotp.size()<4) {
            for (int i=0;i<=4;i++)
            {
                int d=(int)(Math.random()*4)+1;
                if(!userotp.contains(d))
                    userotp.add(d);
            }
        }
        for (int i=1;i<100;i++)
        {
            Collections.shuffle(dbotp);
            if(userotp.equals(dbotp))
            {
                System.out.println("Matched ");return ;
            }
            else
                System.out.println("Not matched");
        }
    }
}