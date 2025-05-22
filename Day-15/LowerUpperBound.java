import java.util.Arrays;

public class LowerUpperBound {
    static int[] lower(int[] arr, int target){
        int n = arr.length;
        int lower=n,upper=n;
        int l=0,r=n-1;
        
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,11,12,14};
        int target = 9;
        System.out.println(Arrays.toString(lower(arr, target)));
    }
}
