import java.util.Scanner;
public class SortZeroesOnesTwos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter an element : ");
            arr[i]= sc.nextInt();
        }
        int low =0;
        int mid =0;
        int high = n-1;
        while(mid<high)
        {
            if (arr[mid]==0)
            {
                int p =arr[mid];
                arr[mid]=arr[low];
                arr[low]=p;
                ++mid;
                ++low;
            }
            else if(arr[mid]==1)
            {
                ++mid;
            }
            else if(arr[mid]==2)
            {
                int t= arr[mid];
                arr[mid]= arr[high];
                arr[high]=t;
                --high;
            }

        }
            for(int i=0;i<n;++i)
            {
                System.out.print(arr[i] + "  ");
            }
    }
}
