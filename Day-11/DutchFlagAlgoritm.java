import java.util.Arrays;

public class DutchFlagAlgoritm {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortA(int[] arr) {

        int l = 0;
        int m = 0;
        int h = arr.length - 1;
        while (m < h) {
            if (arr[m] == 1) {
                m++;
            } else if (arr[m] == 0) {
                swap(arr, m, l);
                m++;
                l++;
            } else {
                swap(arr, m, h);
                h--;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 2, 0, 1, 1, 0, 2, 1 };
        System.out.println(Arrays.toString(sortA(arr)));

    }
}