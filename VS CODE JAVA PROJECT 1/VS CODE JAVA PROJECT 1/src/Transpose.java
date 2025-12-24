import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

        for(int i=0;i<m-1;++i)
        { 
            for(int j=i+1;j<n;++j)
            { if(i!=j)
               {int temp =arr[i][j];
                arr[i][j]=arr[j][i];
            arr[j][i]=temp;}
            }
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
