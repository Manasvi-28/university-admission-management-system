import java.util.Scanner;

public class SearchMatrix {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
      System.out.println("Enter the dimensions of the array: ");
        int m=sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<m;++i)
        {for(int j=0;j<n;++j)
            {
                arr[i][j]=sc.nextInt();
            }}
            System.out.println("enter  the number to be searched: ");
            int t = sc.nextInt();
            int i=0;int j=n-1;
            while(i<m&&j>=03)
            {
                if(arr[i][j]==t)
                {
                    System.out.println("Element found");
                    System.exit(0);
                }
                else if( arr[i][j]<t)
                ++i;
                else
                --j;
            }
            System.out.println("Element not found");
   }  
}
