import java.util.Scanner;
public class SortZeroesAndOnes {
    
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n= sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;++i)
    {
        System.out.println("enter either 0 or 1 : ");
        arr[i]=sc.nextInt();
    }
    int j=n-1;
    int i=0;
    while(i<j)
     {
        if(arr[i]==0)
        {++i;}
        if(arr[j]==1)
        --j;
        else
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        ++i;
        --j;
    }
            
    }
    System.out.println( "sorted array : ");
    for(int p=0;p<n;++p)
    {
        System.out.print(arr[p]+ "  ");
    }

}}
