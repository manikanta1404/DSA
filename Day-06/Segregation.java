public class Segregation {
    static void segregateZeroesOnes(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                ++left;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 0, 0, 1, 1};
        segregateZeroesOnes(a);
        System.out.print("Array after segregation is: ");
        for (int i = 0; i < a.length; ++i) {
        System.out.print(a[i] + " ");
        
        }
    }
    
}
