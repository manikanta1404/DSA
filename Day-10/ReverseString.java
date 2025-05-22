import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    static void swapString(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }

    static char[] reverseString(char[] str) {

        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            swapString(str, i, j);
            i++;
            j--;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String spl = str.split();
        char[] s = str.toCharArray();
        System.out.println(Arrays.toString(reverseString(s)));
        sc.close();
    }
    
}

