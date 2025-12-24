import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows of pascal's triangle : ");
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>(n);
        for(int i=0;i<n;++i)
        {
            List<Integer> brr=new ArrayList<>(i+1);
            brr.add(1);
            for(int j=1;j<i;++j)
            {
                brr.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }
            if(i!=0)
            {brr.add(1);}
            arr.add(brr);
        }
        for(int i=0;i<n;++i)
        {
            System.out.println(arr.get(i));
        }
    }
}
