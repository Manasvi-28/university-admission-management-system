public class LargestString {
      public static void main(String[] args) {
        String arr[]={"00000456","123456","999","111","0501","102566","00123"};
        String max= nozero(arr[0]);
        int m=0;
        for(int i=1;i<arr.length;++i)
        {
            String a=nozero(arr[i]);
            if(max.length()<a.length())
            {
                max=a;
                m=i;
            }
            else if(max.length()==a.length())
            {
                if(a.compareTo(max)>=0)
                {
                    max=a;
                    m=i;
                }
            
            }
        }
        System.out.println("The largest string is : " + arr[m]);
      }
      public static String nozero(String a)
      {int i=0;
        while(a.charAt(i)=='0')
        {
            ++i;
        }
        return a.substring(i);
      }
}
