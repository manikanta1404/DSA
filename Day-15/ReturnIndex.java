// import java.util.Arrays;

public class ReturnIndex {

    static int binary(int[] arr, int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // Arrays.sort(arr);
        int target = 3;
        System.out.println("target index at " + binary(arr, target));

    }
}