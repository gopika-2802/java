package DAY9;

public class CountTheOccOfLetter {
    public static void main(String[] args) {
        String str="hello world for java";
        int count=0,sp=0;
        String v=" ";
        String c=" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str.charAt(i)=='l')// occerence
            {
                count++;
                if(ch == 'a' || ch == 'A' ||ch == 'e' || ch == 'E' ||ch == 'i' ||
                   ch == 'I' ||ch == 'o' || ch == 'O' ||ch == 'u' || ch == 'U')
                v+=str.charAt(i);// vowels in occ
                else
                c+=str.charAt(i);//cons in occ
            }
            else if(str.charAt(i)==' ') 
            sp++;
            else if(ch == 'a' || ch == 'A' ||ch == 'e' || ch == 'E' ||ch == 'i'||
                    ch == 'I' ||ch == 'o' || ch == 'O' ||ch == 'u' || ch == 'U')
            v+=str.charAt(i);//to store vowels
            else c+=str.charAt(i);//to store con 
        }
        System.out.println("\n"+count+"\nSPACE "+sp+"\nvowels "+v+"\nconsonents "+c);
        System.out.println(str.substring(0,10));
    }
}

