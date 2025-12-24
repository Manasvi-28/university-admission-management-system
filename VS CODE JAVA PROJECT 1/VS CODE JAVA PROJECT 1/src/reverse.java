public class reverse {
    public static void main(String[] args) {
        int arr[]={7,8,9,10,5};
        for(int i=0;i<((arr.length)/2);++i)
        {
            int x= arr[i];
           arr[i] =arr[arr.length-1-i];
           arr[arr.length-1-i]=x;

        }
           for(int i=0;i<arr.length;++i)
           {
             System.out.println(arr[i]); 
           }
    }
}
