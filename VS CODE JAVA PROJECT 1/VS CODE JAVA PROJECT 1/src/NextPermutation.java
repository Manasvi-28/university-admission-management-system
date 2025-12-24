import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter the elements of the array : ");
            arr[i]=sc.nextInt();
        }
        int index=-1;
        for(int i=n-2;i>=0;--i)
        {
          if(arr[i]<arr[i+1])
          {
            index=i;
            break;
          }
        }
        if(index>=0)
        {
            for(int i=n-1; i>index;--i)
            {
               if(arr[i]>arr[index])
                 {
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                 }
            }
        }
        reverse(arr,(index+1),n-1);
        for (int ele : arr)
        {
            System.out.print(ele + "  ");
        }


    }
    public static void reverse(int arr[],int i,int j)
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
    
}
