public class PalindromeWithPointers {
    static boolean check(String str){
        int i =0;
        int j=str.length()-1;
        
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int num = 1213121;
        String str = String.valueOf(num);
        System.out.println(check(str));

    }
}
