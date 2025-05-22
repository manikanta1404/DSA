public class Missing {

    // static int checkSort(int[] arr){
    //     int tem = 0;
    //     for (int i=1;i<arr.length-1;i++){
    //         if(arr[i]<arr[i+1]){
    //             if(arr[i]-arr[i+1]!=1){
    //                 tem = arr[i]-arr[i+1];
    //                 return arr[i]+tem;
    //             }
    //         }
    //     }
    //     return 0;
    // }
    public static void main(String[] args) {
        int[ ] arr = {3,7,8,9};
        int res = 0;
        for(int i= 0;i<arr.length-1;i++){
            if(arr[i]+1 != arr[i+1]){
                res = arr[i]+1;
            }
            
        }
        System.out.println(res);

        // System.out.println("missing number " + checkSort( arr));
    }
}
