public class Checktarget {
    static String checkTarget(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return "true";
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        System.out.println(checkTarget(arr, target));
        System.out.println();
    }
    
}
