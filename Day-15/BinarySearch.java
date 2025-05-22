public class BinarySearch {

    static int binary(int[] arr, int target) {
        int l = 0, n = arr.length, r = n - 1;
        while (l <= r) {
            int mid =  (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < arr[l]) {
                if (arr[l] <= target && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if(arr[mid]>target){
                if(arr[r]<=target && target> arr[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 4, 5, 6 };
        // Arrays.sort(arr);
        int target = 7;
        System.out.println("target index at " + binary(arr, target));
    }
}
