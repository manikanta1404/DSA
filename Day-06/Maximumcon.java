public class Maximumcon {

    public static void main(String[] args) {
        
        int [] arr = {0,1,1,0,0,1,1,1,1,0,1};
        int m= 0;
        int c =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c++;
            }
            else{
                c = 0;
            }
            m = Math.max(m, c);
        }
        System.out.println(m);
    }
}
