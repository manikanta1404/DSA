public class Sorting {

    static String checkSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return "unsorted";
            }
        }
        return "sorted";
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(checkSort(arr));
    }
 
}
