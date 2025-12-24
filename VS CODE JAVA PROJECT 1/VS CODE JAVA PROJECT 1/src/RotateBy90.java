import java.util.Scanner;

public class RotateBy90 {
    public static int[][] transpose(int arr[][],int m)
    {
        for(int i=0;i<m-1;++i)
        { 
            for(int j=i+1;j<m;++j)
            { if(i!=j)
               {int temp =arr[i][j];
                arr[i][j]=arr[j][i];
            arr[j][i]=temp;}
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int m=sc.nextInt();
        int arr[][]=new int[m][m];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<m;++i)
        {for(int j=0;j<m;++j)
            {
                arr[i][j]=sc.nextInt();
            }}
        arr=transpose(arr,m);
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<m/2;++j)
            {
                int temp =arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=temp;
            }
        }
for(int i=0;i<m;++i)
        { 
            for(int j=0;j<m;++j)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
