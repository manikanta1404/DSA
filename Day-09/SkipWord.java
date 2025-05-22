public class SkipWord {
    static String remove(String str , String word){
        
        if(str.isEmpty()){
            return " ";
        }
        char ch = str.charAt(0);
        if(str.startsWith(word)){
            return remove((str.substring(word.length())), word);
        }
        else{
            return ch + remove(str.substring(1), word);
        }

    }

    public static void main(String[] args) {
        String str = "abcdhellogdf";
        String word = "he";
        System.out.println(remove(str, word));

    }
}