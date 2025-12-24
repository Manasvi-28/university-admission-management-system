import java.util.Scanner;

public class SetMatrixZero {
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
            boolean flag=false;
            boolean flagg=false;

            for( int i=0;i<m;++i)
            {
                for(int j=0;j<n;++j)
                {
                    if(arr[i][j]==0)
                    {
                        arr[i][0]=0;
                        arr[0][j]=0;
                        if(j==0)
                        flag=true;
                        if(i==0)
                        flagg=true;
                    }
                }
            }
            for(int j=1;j<n;++j)
            {
                if(arr[0][j]==0)
                {
                    for(int i=1;i<m;++i)
                    arr[i][j]=0;
                }
            }
            for(int i=1;i<m;++i)
            {
                if(arr[i][0]==0)
                {
                    for(int j=1;j<n;++j)
                    arr[i][j]=0;
                }
            }
            if(flag==true)
            {
                for(int i=0;i<m;++i)
                arr[i][0]=0;
            }
            if(flagg==true)
            {
                for(int i=0;i<n;++i)
                arr[0][i]=0;
            }
            for(int i=0;i<m;++i)
        { 
            for(int j=0;j<n;++j)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
