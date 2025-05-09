// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {1,8,10,45,45};
        int count = 0;
        int high = arr[0];
        int second = arr[0];
        for (int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(" even count is "+ count + " and odd count is " + 
            (arr.length - count));
            
        // {
        //     output
        //     even count is 2 and odd count is 3
        // }
          //first highst value
        for (int i=0;i<arr.length;i++){
            if(high<arr[i] ){
                second=high;
                high = arr[i];
            }
            else if(arr[i]>second && arr[i]<high){
                
                second = arr[i];
            }
            
        }
        //second highst value
        
        // for (int i = 0;i<arr.length;i++){
        //     if(high != second && arr[i]>second && arr[i] != high){
        //         second = arr[i];
        //     }
        // }
        System.out.println("highest value "+ high);
        System.out.println(" second highest value "+ second);
        
    }
    
}
