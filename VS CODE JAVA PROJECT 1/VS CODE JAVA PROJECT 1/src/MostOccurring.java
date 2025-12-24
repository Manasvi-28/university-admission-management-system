import java.util.Scanner;

public class MostOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        int t=sb.length();
        int max=0;
        char chh='\u0000';
        while(sb.length()>0)
        {
            char ch =sb.charAt(0);
            int n=1;
            sb.deleteCharAt(0);
            int i=0;
            while(i<sb.length())
            {   if(i<sb.length())
                {
                if(sb.charAt(i)==ch)
                 {
                    ++n;
                    sb.deleteCharAt(i);
                 }
                 else
                 ++i;}

            }
            if(n>max)
            {
                max=n;
                chh=ch;
            }
            

        }
    System.out.println("The character with the most length is "+chh+"having length "+max);
    String p="101";
    String g="111";
    System.out.println(p.compareTo(g));



    }
}
