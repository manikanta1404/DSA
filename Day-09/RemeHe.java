public class RemeHe {
    static String remove(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("he") && !str.startsWith("hello")){
            return remove(str.substring(2));
        }
        else{
            return ch + remove(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "abcdhhellogfd";
        System.out.println(remove(str));
    }
}
