package DAY11;

// import java.util.Arrays;

public class revtheword {
    public static void main(String[] args) {
    String s="Hello World";
    String sp[]=s.split("\\s+");
    String r="";
    for(int i=sp.length-1;i>=0;i++)
    {
        r+=sp[i];
        if(i>0) r+=" ";
    }
    System.out.println(r);

    }
    
}
