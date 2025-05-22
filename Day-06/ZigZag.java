public class ZigZag {
    static int zigzagSum(int[] arr) {
        int sum = 0;
        boolean isGreater = true; // Flag to alternate between greater and lesser
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i % 2 == 0 && i < arr.length - 1) {
                if (arr[i] > arr[i + 1] && isGreater) {
                    // Swap if not in zigzag order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isGreater = !isGreater;
                }
            } else if (i % 2 != 0 && i < arr.length - 1) {
                if (arr[i] < arr[i + 1] && !isGreater) {
                    // Swap if not in zigzag order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isGreater = !isGreater;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,7,8,9};
        System.out.println(zigzagSum(arr1));
    }
    
}
