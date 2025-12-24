import java.util.Scanner;

public class SubstringOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        int i = 0, j = 0;

        while (j < s.length()) {
            char ch = s.charAt(i);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') != true) {
                ++i;
                ++j;
            } else {
                if (j < s.length()) {
                    while (j < s.length() && (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')) {
                        ++j;
                    }
                    int temp = i;
                    while (temp < j) {
                        int k = temp + 1;
                        while (k <= j) {
                            System.out.print(s.substring(temp, k) + " ");
                            ++k;
                        }
                        ++temp;
                    }
                    i = j;
                }
            }
        }
    }
}

