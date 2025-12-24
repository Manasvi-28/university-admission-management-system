import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the dimensions of first matrix: ");
        int m=sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
         System.out.println("Enter the no of columns of second matrix: ");
        int p = sc.nextInt();
        int brr[][]=new int[n][p];
        System.out.println("Enter the elements of first matrix: ");
        for(int i=0;i<m;++i)
        {for(int j=0;j<n;++j)
            {
                arr[i][j]=sc.nextInt();
            }}
        System.out.println("Enter the elements of second matrix: ");
        for(int i=0;i<n;++i)
        {for(int j=0;j<p;++j)
            {
                brr[i][j]=sc.nextInt();
            }}
            int crr[][]=new int[m][p];
            for(int i=0;i<m;++i)
            {
                for(int j=0;j<p;++j)
                {    crr[i][j]=0;
                    for(int k=0;k<n;++k)
                    {
                        crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]);
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<p;++j)
                {
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }

    }
}
