import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.nextLine();
        int i=0;
        int j=0;
        String ss="";
        s+=" ";
        while(j<s.length())
        {
            while(s.charAt(j)!= ' ')
            ++j;
            StringBuilder sb =new StringBuilder(s.substring(i,j));
            sb.reverse();
            ss=ss+sb+" ";
            i=j+1;
            ++j;
    }
    System.out.println(ss);
    System.out.println("flow".contains("flower"));
        
    }
}
