public class RemoveString {
    static String remove(String str){
        
        if(str.isEmpty()){
            return " ";
        }
        char ch = str.charAt(0);
        if(ch=='e'){
            return remove(str.substring(1));
        }
        else{
            return ch + remove(str.substring(1));
        }

    }

    public static void main(String[] args) {
        String str = "hello";
        // char target = 'e';
        System.out.println(remove(str));

    }
}