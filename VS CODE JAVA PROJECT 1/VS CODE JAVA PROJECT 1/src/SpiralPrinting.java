import java.util.Scanner;

public class SpiralPrinting {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
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
         int minr=0;int minc=0;int maxr=m-1;int maxc=n-1;
         while(minr<=maxr && minc<=maxc)
         {
            for(int i=minc;i<=maxc;++i)
            {
                System.out.print(arr[minr][i]+" ");
            }
            minr++;
            for(int i=minr;i<=maxr;++i)
            {
                System.out.print(arr[i][maxc]+ " ");
            }
            maxc--;
            for(int i=maxc;i>=minc;--i)
            {
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;
            for(int i=maxr;i>=minr;--i)
            {
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
         }
    }
}
