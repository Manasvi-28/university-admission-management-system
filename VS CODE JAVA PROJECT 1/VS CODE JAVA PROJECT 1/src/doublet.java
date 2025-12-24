import java.util.Scanner;
public class doublet {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int m = sc.nextInt();
    int arr[] = new int[m];
    for(int i=0;i<m;++i){
        System.out.println("Enter the element:");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element to be searched");
    int x = sc.nextInt();
    boolean flag= false;
    for(int i=0;i<m;++i)
    {
        for(int j = i+1;j<m;++j)
        { 
             if((arr[i]+arr[j])==x)
             {
                System.out.println("element is the sum of "+arr[i]+" and "+arr[j]+" found at index "+i+","+j );
                flag=true;
             }
        }
    }
    if(flag==false)
    { 
        System.out.println("no two elements' sum is equal to "+ x);
    }
 }
    
}
