import java.util.Scanner;
public class MergeSortedArrays
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  the sizes of the two sorted arrays : ");
        int n=sc.nextInt();
        int m = sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[m];
        int crr[]=new int[m+n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter the elements of the first sorted array : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;++i)
        {
            System.out.println("Enter the elements of the second sorted array : ");
            brr[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
           if(arr[i]<=brr[j])
           {
            crr[k]=arr[i];
            ++i;
           }
           else
           {
            crr[k]=brr[j];
            ++j;
           }
           ++k;
        }
        if(i<n)
        {
            for(int p=i;p<n;++p)
            {
                crr[k]=arr[p];
                ++k;
            }
        }
        if(j<m)
        {
            for(int p=j;p<m;++p)
            {
                crr[k]=brr[p];
                ++k;
            }
        }
        for(int p=0;p<(m+n);++p)
        {
            System.out.println(crr[p] + " ");
        }
    }
}