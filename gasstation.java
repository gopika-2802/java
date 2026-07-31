//leetcode gas station
public class gasstation {
    public static void main(String[] args) 
    {
        int gas[]={1,9,1,4,5};                         
        int cost[]={3,4,5,1,2};
        int start=0;
        int currentpetrol=0;
        int totalpetrol=0;
        for(int i=0;i<gas.length;i++)
        {
            int difference=gas[i]-cost[i];    
            currentpetrol+=difference;
            totalpetrol+=difference;
            if(currentpetrol<0)
            {
                start=i+1;
                currentpetrol=0;
            }
        }
        System.out.println(totalpetrol>=0?start:-1);
    }
}
// at i=0 loop
// dif=1-3=-2
// cur=-2
// tot=-2;
// if(-2<0) start=1; cur=0;

// at i=1 loop
// dif=2-4=2;
// cur=-2;tot=-2;
// if(-2<0) start=2; cur=0;

// at i=2 loop
// dif=3-5=-2;
// cur=-2;tot=-2;
// if(-2<0) start=3; cur=0;


// at i=3 loop
// dif=4-1=3;
// cur=3;tot=3;

// at i=4 loop
// dif=5-2=3;
// cur=3+3=6; tot=6

// sop(6>=0?start(3)):-1