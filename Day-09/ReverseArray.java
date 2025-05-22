import java.util.Arrays;

public class ReverseArray {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr, arr[i], arr[j]);

            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    
}
