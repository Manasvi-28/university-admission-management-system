import java.util.ArrayList;
public class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(23);
        System.out.println(arr);
        arr.add(97);
        int t = arr.get(0);
        System.out.println(t);
        System.out.println(arr);
    }
}