import java.util.Arrays;

public class AddArrayPrefix {

    static int[] add(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9 };
        System.out.println(Arrays.toString(add(arr)));

        
    }
}
