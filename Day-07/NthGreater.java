class NthGreater {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                res[i] = arr[i+1];
            }
            
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        // System.out.println(arr[arr.length+1]);
    }
     
}