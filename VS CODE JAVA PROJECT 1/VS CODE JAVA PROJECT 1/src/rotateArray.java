import java.util.Scanner;
public class rotateArray {
    public void reverse(int arr[],int i,int j)
    {
        while(j>=i)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            ++i;
            --j;
        }
    }
    public void  rotate(int arr[],int k,int n)
    {
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
       int p=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter the elements: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the steps to rotate the given array by: ");
        int k=sc.nextInt();
        if(k<=n)
        p=k;
        else
         p =(k%n);
        //while (p>0){
        //    int t = arr[n-1];
        //    for(int i=n-1;i>0;--i)
         //   {
         //       arr[i]=arr[i-1];
         //   }
         //   arr[0]=t;
          //  --p;
        //}
        rotateArray obj = new rotateArray();
        obj.rotate(arr,p,n);
        for(int i=0;i<n;++i)
        { 
            System.out.print(arr[i]+" ");
        }
        

    }
}
