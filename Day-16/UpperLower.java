public class UpperLower {

    static int lowerBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    static int upperBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 9, 11, 12, 14 };
        int target = 12;
        System.out.println("Lower Bound: " + lowerBound(arr, target));
        System.out.println("Upper Bound: " + upperBound(arr, target));
    }
}
