import java.util.Arrays;

public class ReverseArray {

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

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        System.out.println(Arrays.toString(reverse(arr)));

        String str = "hello";
        char[] res = str.toCharArray();
        System.out.println(res);
        
        System.out.println(Arrays.toString(reverseString(res)));

    }
}
