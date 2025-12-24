import java.util.Scanner;

public class ScoreMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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
        for(int i=0;i<m;++i)
        {if(arr[i][0]==0)
            {
            for(int j=0;j<n;++j)
            {
                arr[i][j]= (arr[i][j]==0)?1:0;
            }
        }}
        for(int j=0;j<n;++j)
        {
            int c=0;
            for(int i=0;i<m;++i)
            {
                if(arr[i][j]==1)
                ++c;
            }
            if(c<m/2.0)
            {
                for(int i=0;i<m;++i)
                arr[i][j]=(arr[i][j]==0)?1:0;
            }
        }
        int sum=0;
        int x=1;
        for(int j=n-1;j>=0;--j)
        {
            for(int i=0;i<m;++i)
            {
                sum +=(arr[i][j]*x);
            }
            x*=2;
        }
        System.out.println("The score after flipping the matrix is : " + sum);
    }
    
}
