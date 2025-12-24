import java.util.Scanner;
public class NextGreatestElement {
    public int Greatest (int i,int arr[],int m)
    {    int high = arr[i];
        for(int a=i;a<m;++a)
        {
            if(arr[a]>high)
            high =arr[a];
        }
        return high;
    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
         int n = sc.nextInt();
         int arr[]= new int[n];
         int brr[]= new int[n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter an element : ");
            arr[i]= sc.nextInt();
        }
        NextGreatestElement obj = new NextGreatestElement();
        int j=0;
        for( int i=0;i<n-1;++i)
        {
            brr[j]= obj.Greatest((i+1),arr,n);
            ++j;

        }
        brr[n-1]=-1;
        for(int i=0;i<n;++i)
        {
            System.out.println(brr[i] +"  ");
        }
    
    }

    
}
